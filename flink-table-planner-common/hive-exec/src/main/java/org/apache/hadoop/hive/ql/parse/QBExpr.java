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

package org.apache.hadoop.hive.ql.parse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the query block expression.
 * 
 **/

public class QBExpr {

  private static final Logger LOG = LoggerFactory.getLogger("hive.ql.parse.QBExpr");

  /**
   * Opcode.
   *
   */
  public static enum Opcode {
    NULLOP, UNION, INTERSECT, INTERSECTALL, EXCEPT, EXCEPTALL, DIFF
  };

  private Opcode opcode;
  private QBExpr qbexpr1;
  private QBExpr qbexpr2;
  private QB qb;
  private String alias;

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public QBExpr(String alias) {
    this.alias = alias;
  }

  public QBExpr(QB qb) {
    opcode = Opcode.NULLOP;
    this.qb = qb;
  }

  public QBExpr(Opcode opcode, QBExpr qbexpr1, QBExpr qbexpr2) {
    this.opcode = opcode;
    this.qbexpr1 = qbexpr1;
    this.qbexpr2 = qbexpr2;
  }

  public void setQB(QB qb) {
    this.qb = qb;
  }

  public void setOpcode(Opcode opcode) {
    this.opcode = opcode;
  }

  public void setQBExpr1(QBExpr qbexpr) {
    qbexpr1 = qbexpr;
  }

  public void setQBExpr2(QBExpr qbexpr) {
    qbexpr2 = qbexpr;
  }

  public QB getQB() {
    return qb;
  }

  public Opcode getOpcode() {
    return opcode;
  }

  public QBExpr getQBExpr1() {
    return qbexpr1;
  }

  public QBExpr getQBExpr2() {
    return qbexpr2;
  }

  public void print(String msg) {
    if (opcode == Opcode.NULLOP) {
      LOG.info(msg + "start qb = " + qb);
      qb.print(msg + " ");
      LOG.info(msg + "end qb = " + qb);
    } else {
      LOG.info(msg + "start qbexpr1 = " + qbexpr1);
      qbexpr1.print(msg + " ");
      LOG.info(msg + "end qbexpr1 = " + qbexpr1);
      LOG.info(msg + "start qbexpr2 = " + qbexpr2);
      qbexpr2.print(msg + " ");
      LOG.info(msg + "end qbexpr2 = " + qbexpr2);
    }
  }

  public boolean isSimpleSelectQuery() {
    if (qb != null) {
      return qb.isSimpleSelectQuery();
    }
    return qbexpr1.isSimpleSelectQuery() && qbexpr2.isSimpleSelectQuery();
  }
}
