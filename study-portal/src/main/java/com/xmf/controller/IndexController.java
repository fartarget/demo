package com.xmf.controller;

import com.xmf.dao.service.UserService;
import com.xmf.entity.User;
import com.xmf.hibernate.basedao.QueryTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/11/21.
 */
@RestController
@RequestMapping("user")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public  String index(){
        return "hello  world";
    }

    @GetMapping("list")
    public  String list(){
        User tbUser=userService.getByUserId(1);
        return  tbUser.toString();
    }

    @RequestMapping("getUserBy")
    public String getUserBy(){
        QueryTable queryTable = new QueryTable();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("user_tel","15151819221");
        User user = new User();
        List<User> users=queryTable.queryResultList(User.class,map);
        return null;
    }
}
