package com.xmf.controller;

import com.xmf.entity.User;
import com.xmf.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dell on 2017/11/21.
 */
@RestController
@RequestMapping("user")

public class IndexController {

   /* @Autowired
    private UserService userService;*/

   @Autowired
   private UserService userService;

    @RequestMapping("index")
    public  String index(){
        return "hello  world";
    }

    /*@GetMapping("list")
    public  String list(){
        User tbUser=userService.getByUserId(1);
        return  tbUser.toString();
    }*/

    @RequestMapping("getAllUser")
    public void getAllUser(){
        List<User> users=userService.getAllUser();
        System.out.println(users);
    }
}
