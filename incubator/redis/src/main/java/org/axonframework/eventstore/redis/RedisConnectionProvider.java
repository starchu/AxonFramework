/*
 * Copyright (c) 2010-2012. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.eventstore.redis;

import redis.clients.jedis.Jedis;

/**
 * @author Allard Buijze
 */
public interface RedisConnectionProvider {

    Jedis newConnection();

    /**
     * TODO: This method should be removed in favor of a truly abstracted ConnectionFactory.
     *
     * @param toClose
     */
    void closeConnection(Jedis toClose);
}
