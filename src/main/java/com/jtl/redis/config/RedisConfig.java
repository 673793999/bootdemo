package com.jtl.redis.config;

import com.jtl.redis.MyRedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
@Configuration
public class RedisConfig {

//    @Bean(name = {"MyRedisProperties"})
//    @ConditionalOnMissingBean
//    public MyRedisProperties redisProperties() {
//        return new MyRedisProperties();
//    }

    @Autowired
    @Qualifier("myRedisProperties")
    private MyRedisProperties properties;


    @Bean
    public RedisConnectionFactory jedisConnectionFactory(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(properties.getMaxTotal());
        poolConfig.setMaxIdle(properties.getMaxIdle());
        poolConfig.setMaxWaitMillis(properties.getMaxWait());
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnCreate(true);
        poolConfig.setTestWhileIdle(true);
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
        jedisConnectionFactory.setHostName(properties.getHost());
        if(null != properties.getPassword()){
            jedisConnectionFactory.setPassword(properties.getPassword());
        }
        jedisConnectionFactory.setPort(properties.getPort());

        //其他配置，可再次扩展

        return jedisConnectionFactory;
    }

    @Bean(name="myRedisTemplate")
    @ConditionalOnMissingBean(
            name = {"myRedisTemplate"}
    )
    public RedisTemplate redisTemplate(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }

}
