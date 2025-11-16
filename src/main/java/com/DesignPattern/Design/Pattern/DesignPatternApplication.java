package com.DesignPattern.Design.Pattern;

import com.DesignPattern.Design.Pattern.FactoryDesign.Car;
import com.DesignPattern.Design.Pattern.FactoryDesign.CarFactory;
import com.DesignPattern.Design.Pattern.Singleton.SingletonDbConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		//Singleton DB Connection
		SingletonDbConnection db1 = SingletonDbConnection.getInstance();
		SingletonDbConnection db2 = SingletonDbConnection.getInstance();

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db1 == db2);

		//Factory Design Pattern

		Car car1 = CarFactory.getCar("Porche");
		car1.collection();

		Car car2 = CarFactory.getCar("Ferrari");
		car2.collection();

		Car car3 = CarFactory.getCar("Lambo");
		car3.collection();
	}

}
