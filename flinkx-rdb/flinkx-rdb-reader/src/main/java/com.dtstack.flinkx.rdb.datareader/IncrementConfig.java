/*
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

package com.dtstack.flinkx.rdb.datareader;

import java.io.Serializable;

/**
 * @author jiangbo
 * @explanation
 * @date 2019/3/29
 */
public class IncrementConfig implements Serializable {

    private boolean increment;

    private boolean useMaxFunc;

    private int columnIndex;

    private String columnName;

    private String columnType;

    private String startLocation;

    private int requestAccumulatorInterval;

    public int getRequestAccumulatorInterval() {
        return requestAccumulatorInterval;
    }

    public void setRequestAccumulatorInterval(int requestAccumulatorInterval) {
        this.requestAccumulatorInterval = requestAccumulatorInterval;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public boolean isUseMaxFunc() {
        return useMaxFunc;
    }

    public void setUseMaxFunc(boolean useMaxFunc) {
        this.useMaxFunc = useMaxFunc;
    }

    public boolean isIncrement() {
        return increment;
    }

    public void setIncrement(boolean increment) {
        this.increment = increment;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }
}
