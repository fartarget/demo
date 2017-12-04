package com.xmf.dao.repo;

import com.xmf.entity.User;
import com.xmf.hibernate.basedao.BaseDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/11/21.
 */
public interface UserRepository extends JpaRepository<User,Integer>{
      User findByUserId(Integer userId);

//      List<User> queryResultList(User user, Map<String,Object> map);
}
