/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

class CalculatorTests {

    /**
     * @Test 表示方法是测试方法，与 Junit4 的 @Test 注解不同的是，这个注解没有声明任何属性，因为 Junit Junpiter
     * 的测试扩张是基于他们自己的专用注解来操作的。可继承。
	 * @DisplayName 声明测试类或测试方法的自定义名称。不可继承
     */
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    /**
     * @RepeatedTest 提供了重复测试指定次数的功能，可继承。
     */
    @Test
    @DisplayName("RepeatedTest")
    @RepeatedTest(value = 3, name = LONG_DISPLAY_NAME)
    void repeatedTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }


    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 102"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}