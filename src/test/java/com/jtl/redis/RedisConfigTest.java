package com.jtl.redis;

import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public class RedisConfigTest {

    @Autowired
    @Qualifier("myRedisTemplate")
    private RedisTemplate myRedisTemplate;


    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void redisTemplate() throws Exception {
        String key = "key1";
        String value = "value1";
        set(key, value);
        System.out.println(get(key));
    }

    public  String get(String key){
        return myRedisTemplate.opsForValue().get(key).toString();
    }

    public  void set(String key, String value){
        myRedisTemplate.opsForValue().set(key, value);
    }

}