package com.diosaraiva.javafundamentals.designpatterns.structural.adapter;

/*
 An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".

 In other words, to provide the interface according to client requirement while using the services of a class with a different interface.

 The Adapter Pattern is also known as Wrapper.

 Advantage of Adapter Pattern
 - It allows two or more previously incompatible objects to interact.
 - It allows reusability of existing functionality.

 Usage of Adapter pattern:
 It is used:
 - When an object needs to utilize an existing class with an incompatible interface.
 - When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
 - When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.

 https://www.javatpoint.com/adapter-pattern
 */
public class AdapterPattern{
	public static void AdapterPatternDemo(){  
		CreditCard targetInterface = new BankCustomer();  
		targetInterface.giveBankDetails();

		System.out.println(targetInterface.getCreditCard());  
	}   
}