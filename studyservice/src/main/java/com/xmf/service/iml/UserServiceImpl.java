package com.xmf.service.iml;

import com.xmf.dao.UserMapper;
import com.xmf.entity.User;
import com.xmf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
//        return userMapper.getAllUser();
        return null;
    }

    /*@Autowired
    private UserDao userDao;*/
}
