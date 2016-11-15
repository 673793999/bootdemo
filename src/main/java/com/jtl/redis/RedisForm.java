package com.jtl.redis;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public class RedisForm<T> {

    private String key;

    private T val;

    private Long time;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }





}
