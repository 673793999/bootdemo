package com.jtl.controller;

import com.sun.deploy.net.HttpResponse;
import com.jtl.common.response.AppResponse;
import com.jtl.model.UserInfo;
import com.jtl.redis.service.MyRedisService;
import com.jtl.service.IRecommendService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
@Controller
@RequestMapping(value = "/recommend")
public class RecommendController {

    @Autowired
    private IRecommendService recommendServiceImpl;

    @Autowired
    MyRedisService<String> myRedisService;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    /**
     * 校验并保存推荐人
     * @param recommendId
     * @param userPhone
     * @param note
     * @return
     */
    @RequestMapping(value = "/saveuser",method = RequestMethod.GET,produces = "application/json")
    public  @ResponseBody AppResponse addRecommend(@RequestParam(name = "recommendId") Long recommendId, @RequestParam(name = "userPhone") String userPhone,@RequestParam(name = "note")String note){
        AppResponse response = recommendServiceImpl.verifyContains(userPhone);
        if(null!=response){//用户已经存在
            return response;
        }
        return recommendServiceImpl.saveRecommend(recommendId,userPhone,note);
    }



    @RequestMapping(value = "/demo",method = RequestMethod.GET,produces = "application/json")
    public @ResponseBody String demoFun(HttpResponse response){

        UserInfo qu = new UserInfo();
        qu.setId(2l);
        UserInfo userInfo = sqlSessionTemplate.selectOne("UserInfo.selUserDetail",qu);

        System.out.println("shuju"+userInfo.getUserPhone());
        return userInfo.getUserPhone();
//
//        RedisForm<String> form = new RedisForm<String>();
//        form.setKey("demokey");
//        form.setVal("demoval");
//        form.setTime(1000l);
//        myRedisService.saveRedisParam(form);
//        System.out.println("数据存储完毕");
//        String name = myRedisService.getRedisParam(form);
//        System.out.println(name);
//        return name;
    }


}
