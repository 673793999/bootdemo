package com.jtl.redis.service.impl;

import com.jtl.redis.RedisForm;
import com.jtl.redis.service.MyRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
@Component
public class MyRedisServiceImpl<T> implements MyRedisService<T> {

    @Autowired
    @Qualifier("myRedisTemplate")
    private RedisTemplate myRedisTemplate;

    @Override
    public void saveRedisParam(RedisForm<T> form) {
        ValueOperations opsForValue = myRedisTemplate.opsForValue();
        opsForValue.set(form.getKey(), form.getVal(),form.getTime(),TimeUnit.MINUTES);
    }

    @Override
    public T getRedisParam(RedisForm<T> form) {
        ValueOperations opsForValue = myRedisTemplate.opsForValue();
        return (T)opsForValue.get(form.getKey());
    }
}
