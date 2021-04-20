package com.example.junitdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class ParametricTest {

    @ParameterizedTest
    @ValueSource(strings = { "abc", "ab c", "abc is abc" })
    void palindromes(String candidate) {
        assertTrue(StringUtils.containsWhitespace(candidate));
    }



    @Test
    void testInAllEnvironments() {
        assumingThat("Windows_NT".equals(System.getenv("OS")),
                () -> {
                    // 假设成立才去执行断言
                    System.out.println("假设成功,才去执行断言");
                    assertEquals(2, 2);
                });
        // 这个是不受影响的
        assertEquals(42, 42);
    }

}
