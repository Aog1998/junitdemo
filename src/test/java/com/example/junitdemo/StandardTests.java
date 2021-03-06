package com.example.junitdemo;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//官方提供的标准测试类
class StandardTests {
    @BeforeAll
    static void initAll() {
    }
    @BeforeEach
    void init() {
    }
    @Test
    void succeedingTest() {
    }
    @Test
    void failingTest() {
        fail("a failing test");
    }
    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }
    @AfterEach
    void tearDown() {
    }
    @AfterAll
    static void tearDownAll() {
    }
}