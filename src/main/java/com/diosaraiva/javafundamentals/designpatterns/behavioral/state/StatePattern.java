package com.diosaraiva.javafundamentals.designpatterns.behavioral.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 A State Pattern says that "the class behavior changes based on its state". In State Pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

 The State Pattern is also known as Objects for States.

 Benefits:
 - It keeps the state-specific behavior.
 - It makes any state transitions explicit.

 Usage:
 - When the behavior of object depends on its state and it must be able to change its behavior at runtime according to the new state.
 - It is used when the operations have large, multipart conditional statements that depend on the state of an object.

 https://www.javatpoint.com/state-pattern
 */
public class StatePattern{  
	Controller controller;  

	StatePattern(String con){  
		controller = new Controller();

		//the following trigger should be made by the user  
		if(con.equalsIgnoreCase("management") || Integer.parseInt(con)==1)	controller.setManagementConnection();  
		if(con.equalsIgnoreCase("sales") || Integer.parseInt(con)==2)		controller.setSalesConnection();  
		if(con.equalsIgnoreCase("accounting") || Integer.parseInt(con)==3)	controller.setAccountingConnection();

		controller.open();  
		controller.log();  
		controller.close();  
		controller.update();  
	}  

	public static void StatePatternDemo() throws IOException{
		System.out.print("Enter Connection [1-management, 2-sales, 3-accounting]: ");  

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		new StatePattern(br.readLine());  
	}  
}