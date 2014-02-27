/*
 * Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.jmh.it.compile.params;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ParamAccessDefaultTest {

    @Param("true")
    boolean param_boolean;

    @Param("0")
    byte param_byte;

    @Param("0")
    short param_short;

    @Param("0")
    char param_char;

    @Param("0")
    int param_int;

    @Param("0")
    float param_float;

    @Param("0")
    long param_long;

    @Param("0")
    double param_double;

    @Param("true")
    Boolean param_Boolean;

    @Param("0")
    Byte param_Byte;

    @Param("0")
    Short param_Short;

    @Param("0")
    Character param_Char;

    @Param("0")
    Integer param_Int;

    @Param("0")
    Float param_Float;

    @Param("0")
    Long param_Long;

    @Param("0")
    Double param_Double;

    @Param("null")
    String param_String;

    @GenerateMicroBenchmark
    public void test() {

    }

}
