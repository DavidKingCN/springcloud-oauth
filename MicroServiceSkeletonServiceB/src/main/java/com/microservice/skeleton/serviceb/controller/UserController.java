package com.microservice.skeleton.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:9:23
 * ProjectName:Mirco-Service-Skeleton
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
