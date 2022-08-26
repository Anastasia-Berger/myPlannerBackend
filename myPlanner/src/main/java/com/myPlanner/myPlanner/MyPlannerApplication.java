package com.myPlanner.myPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPlannerApplication.class, args);
		System.out.println("Spring IoC container was loaded");
	}

}
