package com.example.practicejava.javapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavapracticeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		SpringApplication.run(JavapracticeApplication.class, args);
		Main m=new Main();
		m.executeAll();
	}

}
