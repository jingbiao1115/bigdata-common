/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.exec.vector.expressions.gen;

import org.apache.hadoop.hive.ql.exec.vector.expressions.VectorExpression;
import org.apache.hadoop.hive.ql.exec.vector.expressions.NullUtil;
import org.apache.hadoop.hive.ql.exec.vector.*;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.exec.vector.VectorExpressionDescriptor;

/**
 * Generated from template ColumnArithmeticColumn.txt, which covers binary arithmetic
 * expressions between columns.
 */
public class TimestampColLessDoubleColumn extends VectorExpression {

  private static final long serialVersionUID = 1L;

  private int colNum1;
  private int colNum2;
  private int outputColumn;

  public TimestampColLessDoubleColumn(int colNum1, int colNum2, int outputColumn) {
    this.colNum1 = colNum1;
    this.colNum2 = colNum2;
    this.outputColumn = outputColumn;
  }

  public TimestampColLessDoubleColumn() {
  }

  @Override
  public void evaluate(VectorizedRowBatch batch) {

    if (childExpressions != null) {
      super.evaluateChildren(batch);
    }

    TimestampColumnVector inputColVector1 = (TimestampColumnVector) batch.cols[colNum1];
    DoubleColumnVector inputColVector2 = (DoubleColumnVector) batch.cols[colNum2];
    LongColumnVector outputColVector = (LongColumnVector) batch.cols[outputColumn];
    int[] sel = batch.selected;
    int n = batch.size;
    double[] vector2 = inputColVector2.vector;
    long[] outputVector = outputColVector.vector;

    // return immediately if batch is empty
    if (n == 0) {
      return;
    }

    outputColVector.isRepeating =
         inputColVector1.isRepeating && inputColVector2.isRepeating
      || inputColVector1.isRepeating && !inputColVector1.noNulls && inputColVector1.isNull[0]
      || inputColVector2.isRepeating && !inputColVector2.noNulls && inputColVector2.isNull[0];

    // Handle nulls first
    NullUtil.propagateNullsColCol(
      inputColVector1, inputColVector2, outputColVector, sel, n, batch.selectedInUse);

    /* Disregard nulls for processing. In other words,
     * the arithmetic operation is performed even if one or
     * more inputs are null. This is to improve speed by avoiding
     * conditional checks in the inner loop.
     */
    if (inputColVector1.isRepeating && inputColVector2.isRepeating) {
      outputVector[0] = inputColVector1.getDouble(0) < vector2[0] ? 1 : 0;
    } else if (inputColVector1.isRepeating) {
      double value1 = inputColVector1.getDouble(0);
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          outputVector[i] = value1 < vector2[i] ? 1 : 0;
        }
      } else {
        for(int i = 0; i != n; i++) {
          outputVector[i] = value1 < vector2[i] ? 1 : 0;
        }
      }
    } else if (inputColVector2.isRepeating) {
      double value2 = vector2[0];
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          outputVector[i] = inputColVector1.getDouble(i) < vector2[0] ? 1 : 0;
        }
      } else {
        for(int i = 0; i != n; i++) {
          outputVector[i] = inputColVector1.getDouble(i) < vector2[0] ? 1 : 0;
        }
      }
    } else {
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          outputVector[i] = inputColVector1.getDouble(i) < vector2[i] ? 1 : 0;
        }
      } else {
        for(int i = 0; i != n; i++) {
          outputVector[i] = inputColVector1.getDouble(i) < vector2[i] ? 1 : 0;
        }
      }
    }

    /* For the case when the output can have null values, follow
     * the convention that the data values must be 1 for long and
     * NaN for double. This is to prevent possible later zero-divide errors
     * in complex arithmetic expressions like col2 / (col1 - 1)
     * in the case when some col1 entries are null.
     */
    NullUtil.setNullDataEntriesLong(outputColVector, batch.selectedInUse, sel, n);
  }

  @Override
  public int getOutputColumn() {
    return outputColumn;
  }

  @Override
  public String getOutputType() {
    return "long";
  }

  @Override
  public VectorExpressionDescriptor.Descriptor getDescriptor() {
    return (new VectorExpressionDescriptor.Builder())
        .setMode(
            VectorExpressionDescriptor.Mode.PROJECTION)
        .setNumArguments(2)
        .setArgumentTypes(
            VectorExpressionDescriptor.ArgumentType.getType("timestamp"),
            VectorExpressionDescriptor.ArgumentType.getType("double"))
        .setInputExpressionTypes(
            VectorExpressionDescriptor.InputExpressionType.COLUMN,
            VectorExpressionDescriptor.InputExpressionType.COLUMN).build();
  }
}
