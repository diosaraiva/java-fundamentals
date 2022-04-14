package com.diosaraiva.javafundamentals.designpatterns.structural.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

 https://www.javatpoint.com/composite-pattern
 */
public class Decorator{
	public static void orderFood() throws NumberFormatException, IOException{

		int  choice;  

		do{        
			System.out.print("========= Food Menu ============ \n");  
			System.out.print("            1. Vegetarian Food.   \n");  
			System.out.print("            2. Non-Vegetarian Food.\n");  
			System.out.print("            3. Chineese Food.         \n");  
			System.out.print("            4. Exit                        \n");  
			System.out.print("Enter your choice: ");  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
			choice=Integer.parseInt(br.readLine());  
			switch (choice) {  
			case 1:{   
				VegFood vf=new VegFood();  
				System.out.println(vf.prepareFood());  
				System.out.println(vf.foodPrice());  
			}  
			break;  

			case 2:{  
				Food f1=new NonVegFood((Food) new VegFood());  
				System.out.println(f1.prepareFood());  
				System.out.println( f1.foodPrice());  
			}  
			break;    
			case 3:{  
				Food f2=new ChineeseFood((Food) new VegFood());  
				System.out.println(f2.prepareFood());  
				System.out.println( f2.foodPrice());  
			}  
			break;    

			default:{    
				System.out.println("Other than these no food available");  
			}         
			return;  
			}
		} while(choice!=4);  
	}  
}  