package com.DesignPattern.Design.Pattern;

import com.DesignPattern.Design.Pattern.AbstractFactory.BikeFactory;
import com.DesignPattern.Design.Pattern.AbstractFactory.Vehicle;
import com.DesignPattern.Design.Pattern.AbstractFactory.VehicleAbstractFactory;
import com.DesignPattern.Design.Pattern.BuilderDesign.Showroom;
import com.DesignPattern.Design.Pattern.FactoryDesign.Car;
import com.DesignPattern.Design.Pattern.FactoryDesign.CarFactory;
import com.DesignPattern.Design.Pattern.IteratorDesign.Iterator;
import com.DesignPattern.Design.Pattern.IteratorDesign.OfferLetter;
import com.DesignPattern.Design.Pattern.ProtoTypeDesign.Company;
import com.DesignPattern.Design.Pattern.Singleton.SingletonDbConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		//Singleton DB Connection
		System.out.println("Singleton Design Pattern");

		SingletonDbConnection db1 = SingletonDbConnection.getInstance();
		SingletonDbConnection db2 = SingletonDbConnection.getInstance();

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db1 == db2);

		System.out.println("");

		//Factory Design Pattern
		System.out.println("Factory Design Pattern");

		Car car1 = CarFactory.getCar("Porche");
		car1.collection();

		Car car2 = CarFactory.getCar("Ferrari");
		car2.collection();

		Car car3 = CarFactory.getCar("Lambo");
		car3.collection();

		System.out.println("");

		//Abstract Factory Pattern
		System.out.println("Abstract Factory Pattern");
		VehicleAbstractFactory carFactory = new com.DesignPattern.Design.Pattern.AbstractFactory.CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.Own();

		VehicleAbstractFactory bikeFactory = new BikeFactory();
		Vehicle bike = bikeFactory.createVehicle();
		bike.Own();

		System.out.println("");


		//Builder Design Pattern
		System.out.println("Builder Design Pattern");
		Showroom myColletion = new Showroom.Builder()
				.setCar("BMW")
				.setBike("Harley")
				.setScooty("Activa")
				.setXUV("GWAGON")
				.build();
		myColletion.Show();

		Showroom myColletion2 = new Showroom.Builder()
				.setCar("Porche")
				.setBike("Aprilla")
				.setXUV("XUV7OO")
				.build();
		myColletion2.Show();

		System.out.println("");

		//Prototype Design Pattern
		System.out.println("Prototype Design Pattern");
		Company company1 = new Company("IT", "Google", "50LPA");
		company1.show();

		Company company2 = (Company) company1.clone();
		company2.setName("Amazon");
		company2.show();

		System.out.println("");

		//Iterator Design Pattern
		System.out.println("Iterator Design Pattern");
		OfferLetter offerLetter = new OfferLetter();
		Iterator it = offerLetter.getIterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
