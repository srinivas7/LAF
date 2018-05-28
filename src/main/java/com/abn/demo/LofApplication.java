package com.abn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication( scanBasePackages =  {"com.abn"} )
public class LofApplication {

	public static void main(String[] args) {
		SpringApplication.run(LofApplication.class, args);
	}
}
