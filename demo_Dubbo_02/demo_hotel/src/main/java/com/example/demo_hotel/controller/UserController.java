package com.example.demo_hotel.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo_Dubbo_02Api.DemoService;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        String s = demoService.sayHello("你好世界！");
        return s;
    }

}
