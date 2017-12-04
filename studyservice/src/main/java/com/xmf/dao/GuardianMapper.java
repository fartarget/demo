package com.xmf.dao;

import com.xmf.entity.Guardian;
import com.xmf.entity.GuardianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuardianMapper {
    long countByExample(GuardianExample example);

    int deleteByExample(GuardianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Guardian record);

    int insertSelective(Guardian record);

    List<Guardian> selectByExample(GuardianExample example);

    Guardian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Guardian record, @Param("example") GuardianExample example);

    int updateByExample(@Param("record") Guardian record, @Param("example") GuardianExample example);

    int updateByPrimaryKeySelective(Guardian record);

    int updateByPrimaryKey(Guardian record);
}