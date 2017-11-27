package com.xmf.dao.repo;

import com.xmf.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dell on 2017/11/21.
 */
public interface UserRepository extends JpaRepository<TbUser,Integer>{
      TbUser findByUserId(Integer userId);
}
