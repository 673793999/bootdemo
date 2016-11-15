package com.jtl.redis.service;

import com.jtl.redis.RedisForm;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public interface MyRedisService<T> {

    //参数存放(带过期时间)
    public void saveRedisParam(RedisForm<T> form);
    //参数获取
    public T getRedisParam(RedisForm<T> form);
    //参数删除

    //参数判断


}
