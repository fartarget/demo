package com.xmf.dao;

import com.xmf.entity.RoleFolder;
import com.xmf.entity.RoleFolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleFolderMapper {
    long countByExample(RoleFolderExample example);

    int deleteByExample(RoleFolderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleFolder record);

    int insertSelective(RoleFolder record);

    List<RoleFolder> selectByExample(RoleFolderExample example);

    RoleFolder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleFolder record, @Param("example") RoleFolderExample example);

    int updateByExample(@Param("record") RoleFolder record, @Param("example") RoleFolderExample example);

    int updateByPrimaryKeySelective(RoleFolder record);

    int updateByPrimaryKey(RoleFolder record);
}