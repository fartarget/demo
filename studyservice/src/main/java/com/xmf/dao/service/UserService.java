package com.xmf.dao.service;

import com.xmf.entity.User;

/**
 * Created by dell on 2017/11/21.
 */

public interface UserService {
    User getByUserId(Integer userID);

    User save(User tbUser);
}
