package com.xmf.dao;

import com.xmf.entity.ClassUser;
import com.xmf.entity.ClassUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassUserMapper {
    long countByExample(ClassUserExample example);

    int deleteByExample(ClassUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassUser record);

    int insertSelective(ClassUser record);

    List<ClassUser> selectByExample(ClassUserExample example);

    ClassUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassUser record, @Param("example") ClassUserExample example);

    int updateByExample(@Param("record") ClassUser record, @Param("example") ClassUserExample example);

    int updateByPrimaryKeySelective(ClassUser record);

    int updateByPrimaryKey(ClassUser record);
}