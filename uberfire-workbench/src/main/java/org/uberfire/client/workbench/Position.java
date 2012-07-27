/*
 * Copyright 2012 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.uberfire.client.workbench;

/**
 * 
 */
public enum Position {

    NONE(
            "---None---"),
    NORTH,
    SOUTH,
    EAST,
    WEST,
    SELF,
    ROOT;

    private String displayName;

    Position() {
        String s = super.toString();
        this.displayName = s.substring( 0,
                                        1 ) + s.substring( 1 ).toLowerCase();
    }

    Position(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

}