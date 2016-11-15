package com.jtl.dao;


import com.jtl.form.RecommendUserExample;
import com.jtl.model.RecommendUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecommendUserDao {
    int countByExample(RecommendUserExample example);

    int deleteByExample(RecommendUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecommendUser record);

    int insertSelective(RecommendUser record);

    List<RecommendUser> selectByExample(RecommendUserExample example);

    RecommendUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecommendUser record, @Param("example") RecommendUserExample example);

    int updateByExample(@Param("record") RecommendUser record, @Param("example") RecommendUserExample example);

    int updateByPrimaryKeySelective(RecommendUser record);

    int updateByPrimaryKey(RecommendUser record);
}