package com.example.demo_Dubbo_02Provider.provider;

import java.util.Date;

import com.example.demo_Dubbo_02Api.DemoService;

import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}