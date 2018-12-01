package com.example.demoredis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoRedisApplicationTests {
    @Before
    public void init(){
        System.out.println("开始测试");
    }

    @Resource
    private RedisConfig redisConfig;

    @Test
    public void contextLoads() {
    redisConfig.say();


    }




    @After
    public void after() {
        System.out.println("测试结束");
    }
}
