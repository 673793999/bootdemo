package com.jtl.service.impl;

import com.jtl.common.response.AppResponse;
import com.jtl.model.RecommendUser;
import com.jtl.redis.RedisForm;
import com.jtl.redis.service.MyRedisService;
import com.jtl.service.IRecommendService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RecommendServiceImpl implements IRecommendService {

    @Autowired
    MyRedisService<String> myRedisService;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public AppResponse saveRecommend(Long recommendId, String userPhone, String note) {
        AppResponse response;
        //对note进行校验
        RedisForm<String> form = new RedisForm<String>();
        form.setKey(userPhone);
        String noteold = myRedisService.getRedisParam(form);
        if(null==noteold||!noteold.equals(note)){
            new AppResponse(AppResponse.RESPONSE.USER_VALIDATE_MOBILE_FAILED,null);
        }
        //2校验用户是否存在
        response = verifyContains(userPhone);
        if(null!=response)
            return response;
        RecommendUser recommendUser = new RecommendUser();
        recommendUser.setUserPhone(userPhone);
        recommendUser.setRecommendId(recommendId);
        recommendUser.setCrtTime(new Date());
        //保存记录
        sqlSessionTemplate.insert("RecommendUser.insertSelective",recommendUser);
        return new AppResponse(AppResponse.RESPONSE.SUCCESS,null);
    }

    @Override
    public AppResponse verifyContains(String userPhone) {

        return new AppResponse(AppResponse.RESPONSE.SUCCESS,null);
    }

}
