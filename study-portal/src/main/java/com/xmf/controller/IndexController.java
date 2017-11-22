package com.xmf.controller;

import com.xmf.dao.service.UserService;
import com.xmf.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        List<TbUser> list=userService.getByUserId(1);
        return  list.toString();
    }
}
