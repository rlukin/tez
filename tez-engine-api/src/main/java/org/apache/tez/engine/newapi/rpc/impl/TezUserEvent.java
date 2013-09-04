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

package org.apache.tez.engine.newapi.rpc.impl;

import org.apache.tez.engine.newapi.UserEvent;
import org.apache.tez.engine.newapi.impl.UserEventIDInfo;

public class TezUserEvent {

  private final UserEvent userEvent;

  private UserEventIDInfo sourceInfo;

  private UserEventIDInfo targetInfo;

  public TezUserEvent(UserEvent userEvent, UserEventIDInfo sourceInfo) {
    this.userEvent = userEvent;
    this.setSourceInfo(sourceInfo);
  }

  public UserEvent getUserEvent() {
    return userEvent;
  }

  public UserEventIDInfo getSourceInfo() {
    return sourceInfo;
  }

  public void setSourceInfo(UserEventIDInfo sourceInfo) {
    this.sourceInfo = sourceInfo;
  }

  public UserEventIDInfo getTargetInfo() {
    return targetInfo;
  }

  public void setTargetInfo(UserEventIDInfo targetInfo) {
    this.targetInfo = targetInfo;
  }

}
