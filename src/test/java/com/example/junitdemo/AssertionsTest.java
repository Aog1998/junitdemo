package com.example.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//断言的使用
public class AssertionsTest {
    @Test
    void standardAssertions() {
        assertEquals(2, 2); //断言预期值和实际值相等
        assertEquals(4, 4, "error message");//失败后发出信息
        assertTrue(2 == 2, () -> "error message"); // 断言条件为真
    }

    @Test
    void groupedAssertions() {
        // 分组断言，执行分组中所有断言，分组中任何一个断言错误都会一起报告
        assertAll("person", () -> assertEquals("John", "John"),
                () -> assertEquals("Doe", "Doe"));
    }
}
