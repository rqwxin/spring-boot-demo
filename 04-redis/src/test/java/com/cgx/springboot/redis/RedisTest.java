package com.cgx.springboot.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**********
 * @program: spring-boot-demo
 * @description:
 * @author: cgx
 * @create: 2019-12-15 19:23
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testKeys(){
        Set keys = redisTemplate.keys("*");
        keys.stream().forEach(s->System.out.println(s));
        System.out.print("keys size="+keys.size());
    }

}
