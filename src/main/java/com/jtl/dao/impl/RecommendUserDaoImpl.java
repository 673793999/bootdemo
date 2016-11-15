package com.jtl.dao.impl;

import com.jtl.dao.RecommendUserDao;
import com.jtl.form.RecommendUserExample;
import com.jtl.model.RecommendUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Repository
public class RecommendUserDaoImpl implements RecommendUserDao{
    @Override
    public int countByExample(RecommendUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RecommendUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(RecommendUser record) {
        return 0;
    }

    @Override
    public int insertSelective(RecommendUser record) {
        return 0;
    }

    @Override
    public List<RecommendUser> selectByExample(RecommendUserExample example) {
        return null;
    }

    @Override
    public RecommendUser selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(@Param("record") RecommendUser record, @Param("example") RecommendUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(@Param("record") RecommendUser record, @Param("example") RecommendUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(RecommendUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(RecommendUser record) {
        return 0;
    }
}
