package com.jtl.dao;

import com.jtl.model.UserInfo;

/**
 * com.jtl.dao
 *
 * @Descrition 用户信息dao
 * @Author yang
 * @Date 2016/7/28 10:00
 */
public interface UserDao {

    /**
     * 添加用户
     *
     * @return
     */
    public int addUser(UserInfo userInfo);

    /**
     * 查询用户信息
     *
     * @param userInfo
     * @return
     */
    public UserInfo selUserDetail(UserInfo userInfo);

}
