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

package com.palantir.proxy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotating an interface with {@link Proxy} generate concrete utility class
 * in the same package with the interface name suffixed with {@code Proxy}.
 * <pre>{@code
 * @Proxy
 * interface MyService {}
 *
 * // Produces the 'MyServiceProxy' class:
 * MyService proxyInstance = MyServiceProxy.create(new InvocationHandler() {
 *     @Override
 *     public Object invoke(Object proxy, Method method, Object[] args) {
 *         System.out.printf("Invoked %s on %s\n", method, proxy);
 *         return null;
 *     }
 * });
 * }</pre>
 */
@SuppressWarnings("InvalidBlockTag")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Proxy {}
