package com.example.practicejava.javapractice;

import com.example.practicejava.javapractice.problem16.Main16;
import com.example.practicejava.javapractice.problem7.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavapracticeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		SpringApplication.run(JavapracticeApplication.class, args);
		Main16 m=new Main16();
		m.executeAll();
	}

}
