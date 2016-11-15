package com.jtl.dao.impl;

import com.jtl.dao.RecommendDao;
import com.jtl.form.RecommendExample;
import com.jtl.model.Recommend;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
@Repository
public class RecommendDaoImpl implements RecommendDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public int countByExample(RecommendExample example) {

        return 0;
    }

    @Override
    public int deleteByExample(RecommendExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Recommend record) {
        return 0;
    }

    @Override
    public int insertSelective(Recommend record) {
        return 0;
    }

    @Override
    public List<Recommend> selectByExample(RecommendExample example) {
        return null;
    }

    @Override
    public Recommend selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(@Param("record") Recommend record, @Param("example") RecommendExample example) {
        return 0;
    }

    @Override
    public int updateByExample(@Param("record") Recommend record, @Param("example") RecommendExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Recommend record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Recommend record) {
        return 0;
    }
}
