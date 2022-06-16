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
package org.lealone.xsql.mysql.server.protocol;

import java.nio.ByteBuffer;

public abstract class ResponsePacket extends Packet {

    @Override
    public void write(PacketOutput out) {
        ByteBuffer buffer = out.allocate();
        buffer = write(buffer, out);
        out.write(buffer);
    }

    /**
     * 把数据包写到buffer中，如果buffer满了就把buffer通过前端连接写出。
     */
    public ByteBuffer write(ByteBuffer buffer, PacketOutput c) {
        throw new UnsupportedOperationException();
    }
}
