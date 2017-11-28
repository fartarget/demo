package com.xmf.dao.repo;

import com.xmf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dell on 2017/11/21.
 */
public interface UserRepository extends JpaRepository<User,Integer>{
      User findByUserId(Integer userId);
}
