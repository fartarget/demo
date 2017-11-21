package com.xmf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/11/21.
 */
@RestController
@RequestMapping
public class IndexController {

    @RequestMapping("index")
    public  String index(){
        return "hello  world";
    }
}
