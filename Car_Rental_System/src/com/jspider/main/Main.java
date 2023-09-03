package com.jspider.main;

import com.jspider.carRental.Operations;
import com.jspiders.car.Car;

public class Main {
public static void main(String[] args) {
	   Operations operations = new Operations();

	   
       Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
       Car car2 = new Car("C002", "Honda", "Accord", 70.0);
       Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
       Car car4 = new Car("C003", "Tata","Harrier", 120.0 );
       Car car5 = new Car("C004", "Mahindra","XUV700",170.0 );
       Car car6 = new Car("C005", "Suzuki","Swift", 100.00);
       operations.addCar(car1);
       operations.addCar(car2);
       operations.addCar(car3);
       operations.addCar(car4);
       operations.addCar(car5);
       operations.addCar(car6);
       operations.menu();
   }
}

