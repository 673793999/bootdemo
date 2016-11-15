package com.jtl.dao.impl;

import com.jtl.dao.UserDao;
import com.jtl.model.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public int addUser(UserInfo userInfo) {
        return 0;
    }

    @Override
    public UserInfo selUserDetail(UserInfo userInfo) {
        return null;
    }
}
