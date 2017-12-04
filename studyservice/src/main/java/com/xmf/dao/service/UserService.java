package com.xmf.dao.service;

import com.xmf.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/11/21.
 */

public interface UserService {
    User getByUserId(Integer userID);

    User save(User tbUser);

    List<User> getUserBy(Map<String,Object> map);
}
