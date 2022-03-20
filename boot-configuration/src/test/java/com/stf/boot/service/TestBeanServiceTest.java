package com.stf.boot.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest {
    //注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        // 从测试环境的上下文中去读取xml配置文件,得到testBeanService
//        boolean b = ioc.containsBean("testBeanService");
//        assertTrue(b);
        TestBeanService bean = (TestBeanService) ioc.getBean("testBeanService");
        TestBeanService1 bean1 = (TestBeanService1) ioc.getBean("testBeanService1");
        System.out.println(bean.getName());
        System.out.println(bean1.getAge());

    }
}