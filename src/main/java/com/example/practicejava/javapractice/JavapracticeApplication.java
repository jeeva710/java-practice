package com.example.practicejava.javapractice;

import com.example.practicejava.javapractice.problem10.Main10;
import com.example.practicejava.javapractice.problem12.Main12;
import com.example.practicejava.javapractice.problem15.Onion;
import com.example.practicejava.javapractice.problem15.PanPizza;
import com.example.practicejava.javapractice.problem15.Pizza;
import com.example.practicejava.javapractice.problem16.Main16;
import com.example.practicejava.javapractice.problem7.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavapracticeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		SpringApplication.run(JavapracticeApplication.class, args);
//		Main10 m=new Main10();
//		m.groupByLocation();
//		Pizza piz1=new PanPizza(100);
//		Pizza piz=new Onion(piz1,70);
//		System.out.println(piz.getDetails());
		Main12 m12=new Main12();
		m12.executeAll();

	}

}
