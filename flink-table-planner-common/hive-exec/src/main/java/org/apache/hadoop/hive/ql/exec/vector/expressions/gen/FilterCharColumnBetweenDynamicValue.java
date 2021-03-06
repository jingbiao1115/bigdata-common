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

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.exec.vector.expressions.gen.FilterCharColumnBetween;
import org.apache.hadoop.hive.ql.plan.DynamicValue;
import org.apache.hadoop.hive.serde2.io.DateWritable;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Timestamp;
import org.apache.hadoop.hive.common.type.HiveChar;
import org.apache.hadoop.hive.common.type.HiveDecimal;
import org.apache.hadoop.hive.common.type.HiveVarchar;

public class FilterCharColumnBetweenDynamicValue extends FilterCharColumnBetween {

  private static final long serialVersionUID = 1L;

  private static final Logger LOG = LoggerFactory.getLogger(FilterCharColumnBetweenDynamicValue.class);

  protected DynamicValue leftDynamicValue;
  protected DynamicValue rightDynamicValue;
  protected transient boolean initialized = false;
  protected transient boolean isLeftOrRightNull = false;

  public FilterCharColumnBetweenDynamicValue(int colNum, DynamicValue leftValue, DynamicValue rightValue) {
    super(colNum, new HiveChar("", 1), new HiveChar("", 1));
    this.leftDynamicValue = leftValue;
    this.rightDynamicValue = rightValue;
  }

  public FilterCharColumnBetweenDynamicValue() {
  }

  public DynamicValue getLeftDynamicValue() {
    return leftDynamicValue;
  }

  public void setLeftDynamicValue(DynamicValue leftValue) {
    this.leftDynamicValue = leftValue;
  }

  public DynamicValue getRightDynamicValue() {
    return rightDynamicValue;
  }

  public void getRightDynamicValue(DynamicValue rightValue) {
    this.rightDynamicValue = rightValue;
  }

  @Override
  public void init(Configuration conf) {
    super.init(conf);
    leftDynamicValue.setConf(conf);
    rightDynamicValue.setConf(conf);
  }

  @Override
  public void evaluate(VectorizedRowBatch batch) {
    if (!initialized) {
      Object lVal = leftDynamicValue.getValue();
      Object rVal = rightDynamicValue.getValue();
      if (lVal == null || rVal == null) {
        isLeftOrRightNull = true;
      } else {
        byte[] min = (PrimitiveObjectInspectorUtils.getHiveChar(
            lVal, leftDynamicValue.getObjectInspector()).getStrippedValue().getBytes());
        setLeftValue(min);

        byte[] max = (PrimitiveObjectInspectorUtils.getHiveChar(
            rVal, rightDynamicValue.getObjectInspector()).getStrippedValue().getBytes());
        setRightValue(max);
      }
      initialized = true;
    }

    // Special case for dynamic values - min/max can be null
    if (isLeftOrRightNull) {
      // Entire batch is filtered out
      batch.size = 0;
    }

    super.evaluate(batch);
  }
}
