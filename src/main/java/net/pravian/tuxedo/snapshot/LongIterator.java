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
package net.pravian.tuxedo.snapshot;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LongIterator implements Iterator<Long> {

    private final long[] values;
    private int index = 0;

    public LongIterator(long[] values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Long next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return values[index++];
    }

    @Override
    public void remove() {
        throw new IllegalStateException();
    }

}
