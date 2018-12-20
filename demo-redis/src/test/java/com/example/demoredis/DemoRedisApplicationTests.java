package com.example.demoredis;

import com.example.demoredis.beans.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoRedisApplicationTests {
    @Before
    public void init(){
        System.out.println("开始测试");
    }

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {
        User user =new User();
        user.setName("jziyy");
        user.setPassword("aaaa");
        stringRedisTemplate.opsForValue().increment("count");
        long count = stringRedisTemplate.opsForValue().increment("count");
        for (int i = 0; i < 10; i++) {
            stringRedisTemplate.opsForValue().decrement("count");
        }
        String s = stringRedisTemplate.opsForValue().get("count");
        System.out.println(s);
        redisTemplate.opsForValue().set("jziyy1",user);
        User user1 = (User) redisTemplate.opsForValue().get("jziyy1");
        System.out.println(user1);
        Set set =redisTemplate.keys("j");
        set.forEach(System.out::println);
    }




    @After
    public void after() {
        System.out.println("测试结束");
    }
}
