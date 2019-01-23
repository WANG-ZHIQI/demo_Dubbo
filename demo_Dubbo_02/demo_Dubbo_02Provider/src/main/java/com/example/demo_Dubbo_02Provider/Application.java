package com.example.demo_Dubbo_02Provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException{

		SpringApplication.run(Application.class, args);
		new CountDownLatch(1).await(); //hold住应用，防止provider退出
	}
	
}
