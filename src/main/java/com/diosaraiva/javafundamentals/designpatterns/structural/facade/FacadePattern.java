package com.diosaraiva.javafundamentals.designpatterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".

 In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.

 Practically, every Abstract Factory is a type of Facade.

 Advantage of Facade Pattern
 - It shields the clients from the complexities of the sub-system components.
 - It promotes loose coupling between subsystems and its clients.

 Usage of Facade Pattern:
 It is used:
 - When you want to provide simple interface to a complex sub-system.
 - When several dependencies exist between clients and the implementation classes of an abstraction.

 https://www.javatpoint.com/facade-pattern
 */
public class FacadePattern{
	public static void FacadePatternDemo() throws NumberFormatException, IOException{
		int choice;

		do{
			System.out.print("========= Mobile Shop ============ \n");  
			System.out.print("            1. IPHONE.              \n");  
			System.out.print("            2. SAMSUNG.              \n");  
			System.out.print("            3. BLACKBERRY.            \n");  
			System.out.print("            4. Exit.                     \n");  
			System.out.print("Enter your choice: ");  

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());

			ShopKeeper sk=new ShopKeeper(); 

			switch (choice){
			case 1: sk.iphoneSale(); break;  
			case 2: sk.samsungSale(); break;    
			case 3: sk.blackberrySale(); break;     

			default: System.out.println("Nothing You purchased"); 
			}
		} while(choice!=4);
	}  
}