package com.xmf.dao.service.impl;

import com.xmf.dao.repo.UserRepository;
import com.xmf.dao.service.UserService;
import com.xmf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/11/21.
 */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

   /* @Autowired
    private UserDao userDao;
*/

    @Override
    public User getByUserId(Integer userID) {
        return null;
    }

    @Override
    public User save(User tbUser) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
