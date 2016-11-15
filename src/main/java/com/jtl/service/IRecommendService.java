package com.jtl.service;

import com.jtl.common.response.AppResponse;

/**
 * Created by Administrator on 2016/10/24 0024.
 *
 */
public interface IRecommendService {

    /**
     *保存地推人员
     * @param recommendId
     * @param userPhone
     * @param note
     * @return
     */
    public AppResponse saveRecommend(Long recommendId, String userPhone, String note);

    /**
     * 校验用户是否已经存在
     * @param userPhone
     * @return
     */
    public AppResponse verifyContains(String userPhone);


}
