package com.example.DemoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.DemoService"})
public class QBrainXDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QBrainXDemoServiceApplication.class, args);
	}

}
