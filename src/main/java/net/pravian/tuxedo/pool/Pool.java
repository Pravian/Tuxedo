/*
 * Copyright 2016 Jerom van der Sar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.pravian.tuxedo.pool;

import net.pravian.tuxedo.persistence.Persistable;
import net.pravian.tuxedo.snapshot.Snapshottable;

public interface Pool extends Snapshottable, Persistable, Iterable<Long> {

    public void push(long value);

    public void clear();

    public int size();

}
