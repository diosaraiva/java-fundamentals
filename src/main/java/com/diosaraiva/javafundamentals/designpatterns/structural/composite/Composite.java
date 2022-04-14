package com.diosaraiva.javafundamentals.designpatterns.structural.composite;

/*
 A Composite Pattern says that just "allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects".

 Advantage of Composite Design Pattern
 - It defines class hierarchies that contain primitive and complex objects.
 - It makes easier to you to add new kinds of components.
 - It provides flexibility of structure with manageable class or interface.

 Usage of Composite Pattern
 It is used:
 - When you want to represent a full or partial hierarchy of objects.
 - When the responsibilities are needed to be added dynamically to the individual objects without affecting other objects. Where the responsibility of object may vary from time to time.
 */
public class Composite{
	public static void getCashiers(){  
		Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  
		Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
		Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);   
		Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  

		manager1.add(emp1);  
		manager1.add(emp2);  
		manager1.add(emp3);  
		manager1.print();  
	}
}