package com.tutorial.hystrixapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class HystrixappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixappApplication.class, args);
	}

}
