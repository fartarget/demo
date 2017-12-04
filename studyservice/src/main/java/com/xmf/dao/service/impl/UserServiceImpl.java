package com.xmf.dao.service.impl;

import com.xmf.dao.repo.UserRepository;
import com.xmf.dao.service.UserService;
import com.xmf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/11/21.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    @Override
    public User getByUserId(Integer userID) {
        return repository.findByUserId(userID);
    }

    public User save(User user){
        return repository.save(user);
    }

    @Override
    public List<User> getUserBy(Map<String, Object> map) {
//        return repository.getOne();
//        return repository.queryResultList(User.class,map);
        return null;
    }

}
