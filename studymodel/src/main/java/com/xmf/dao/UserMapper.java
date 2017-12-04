package com.xmf.dao;

import com.xmf.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by dell on 2017/12/3.
 */
@Mapper
public interface UserMapper {

    @Select("select * from tb_user where user_id=#{Id}")
    User findUserById(Integer Id);
}
