package com.diosaraiva.javafundamentals.designpatterns.creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.

 This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.

 Advantage of Prototype Pattern
 The main advantages of prototype pattern are as follows:
 - It reduces the need of sub-classing.
 - It hides complexities of creating objects.
 - The clients can get new objects without knowing which type of object it will be.
 - It lets you add or remove objects at runtime.

 Usage of Prototype Pattern
 - When the classes are instantiated at runtime.
 - When the cost of creating an object is expensive or complicated.
 - When you want to keep the number of classes in an application minimum.
 - When the client application needs to be unaware of object creation and representation.

 https://www.javatpoint.com/prototype-design-pattern
 */
public class PrototypePattern{
	public static void PrintRecords() throws NumberFormatException, IOException{  
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
		System.out.print("Enter Employee Id: ");  
		int eid=Integer.parseInt(br.readLine());  
		System.out.print("\n");  

		System.out.print("Enter Employee Name: ");  
		String ename=br.readLine();  
		System.out.print("\n");  

		System.out.print("Enter Employee Designation: ");  
		String edesignation=br.readLine();  
		System.out.print("\n");  

		System.out.print("Enter Employee Address: ");  
		String eaddress=br.readLine();  
		System.out.print("\n");  

		System.out.print("Enter Employee Salary: ");  
		double esalary= Double.parseDouble(br.readLine());  
		System.out.print("\n");  

		EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  

		e1.showRecord();  
		System.out.println("\n");  
		EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
		e2.showRecord();  
	}     
}
