package com.example.junitdemo;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.assertEquals;

//可控制测试方法执行顺序
//测试方法均以testNNN开头（NNN表示序列号 001-999）
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTest {

    @Test
    // @Ignore
    public void testAAdd() throws Exception {
        System.out.println("A 添加");
        assertEquals(1, 1);
    }

    @Test
    // @Ignore
    @Disabled
    public void testBUpdate() throws Exception {
        System.out.println("B 更新");
        assertEquals(2, 2);
    }

    @Test
    // @Ignore
    public void testCSelect() throws Exception {
        System.out.println("C 查询");
        assertEquals(2, 2);
    }

    @Test
    // @Ignore
    public void testDDelete() throws Exception {
        System.out.println("D 删除");
        assertEquals(1, 1);
    }

}
