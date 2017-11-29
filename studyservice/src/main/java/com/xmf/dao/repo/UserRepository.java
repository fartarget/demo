package com.xmf.dao.repo;

import com.xmf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dell on 2017/11/21.
 */

public interface UserRepository extends JpaRepository{
      User findByUserId(Integer userId);

      User findUserByUserName(String userName);

      User findUserByRealName(String realName);

      User findUserByUserTel(String userTel);

      User findUserBySexAndRealName(int sex,String realName);

//      List<User> findUserByPr
}
