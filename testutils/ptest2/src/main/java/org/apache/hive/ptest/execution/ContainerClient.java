/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.hive.ptest.execution;

import org.apache.hive.ptest.execution.ContainerClientFactory.ContainerClientContext;
<<<<<<< HEAD
=======
import org.apache.hive.ptest.execution.conf.TestBatch;
>>>>>>> a1fe94a... Temp work related to docker execution phase. code may not compile

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public interface ContainerClient {
<<<<<<< HEAD
  void defineImage(String dir, String label) throws IOException;
  String getBuildCommand(String dir, long toWait, TimeUnit unit)
      throws Exception;
=======
  void defineImage(String dir) throws Exception;
  String getBuildCommand(String dir, long toWait, TimeUnit unit)
      throws Exception;
  String getRunContainerCommand(String containerName, TestBatch testBatch);
>>>>>>> a1fe94a... Temp work related to docker execution phase. code may not compile
}
