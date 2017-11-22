package com.xmf.dao.service;

import com.xmf.entity.TbUser;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by dell on 2017/11/21.
 */

public interface UserService {
    List<TbUser> getByUserId(Integer userID);
}
