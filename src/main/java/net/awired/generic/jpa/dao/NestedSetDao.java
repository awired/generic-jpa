/**
 *
 *     Copyright (C) Awired.net
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package net.awired.generic.jpa.dao;

import java.io.Serializable;
import java.util.List;
import net.awired.generic.jpa.entity.IdEntity;

public interface NestedSetDao<ENTITY extends IdEntity<KEY>, KEY extends Serializable> {

    //    List<ENTITY> findByLeftRight(KEY idThread, Long left, Long right);

    //    ENTITY findByLeftRight(KEY idThread, Long left, Long right, KEY idToReturn);

    //    ENTITY findByLeft(KEY idThread, Long left);

    List<ENTITY> findByThreadId(KEY threadId);

    //    ENTITY findByThread(ENTITY thread);

    //    List<ENTITY> findByIdWithSub(KEY idNode);

    //    List<ENTITY> findByIdWithTree(KEY idNode);

}
