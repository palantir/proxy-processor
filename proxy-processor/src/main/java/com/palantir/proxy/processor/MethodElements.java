/*
 * (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.proxy.processor;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.type.ExecutableType;

final class MethodElements {
    private final ExecutableType type;
    private final ExecutableElement element;

    MethodElements(ExecutableType type, ExecutableElement element) {
        this.type = type;
        this.element = element;
    }

    ExecutableType type() {
        return type;
    }

    ExecutableElement element() {
        return element;
    }

    @Override
    public String toString() {
        return "MethodElements{type=" + type + ", element=" + element + '}';
    }
}
