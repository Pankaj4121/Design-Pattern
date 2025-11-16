package com.DesignPattern.Design.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		SingletonDbConnection db1 = SingletonDbConnection.getInstance();
		SingletonDbConnection db2 = SingletonDbConnection.getInstance();

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db1 == db2);
	}

}
