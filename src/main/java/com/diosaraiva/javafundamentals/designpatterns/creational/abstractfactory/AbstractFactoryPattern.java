package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

 An Abstract Factory Pattern is also known as Kit.

 Advantage of Abstract Factory Pattern
 - Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
 - It eases the exchanging of object families.
 - It promotes consistency among objects.

 Usage of Abstract Factory Pattern
 - When the system needs to be independent of how its object are created, composed, and represented.
 - When the family of related objects has to be used together, then this constraint needs to be enforced.
 - When you want to provide a library of objects that does not show implementations and only reveals interfaces.
 - When the system needs to be configured with one of a multiple family of objects.

 https://www.javatpoint.com/abstract-factory-pattern
 */
public class AbstractFactoryPattern{  
	public static void AbstractFactoryPatternDemo() throws IOException{
		System.out.print("Enter the name of Bank from where you want to take loan amount [1.HDFC, 2.ICICI, 3.SBI]: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
		String bankName=br.readLine();

		if(bankName.equals("1")) bankName="HDFC";
		if(bankName.equals("2")) bankName="ICICI";
		if(bankName.equals("3")) bankName="SBI";

		System.out.print("\nEnter the type of loan e.g. home loan or business loan or education loan [1.Home, 2.Business, 3.Education]: ");  
		String loanName=br.readLine();

		if(loanName.equals("1")) loanName="Home";
		if(loanName.equals("2")) loanName="Business";
		if(loanName.equals("3")) loanName="Education";

		AbstractBankFactory bankFactory = FactoryCreator.getFactory("Bank");  
		Bank b=bankFactory.getBank(bankName);  

		System.out.print("\nEnter the interest rate for "+b.getBankName()+ ": ");  
		double rate=Double.parseDouble(br.readLine());

		System.out.print("\nEnter the loan amount you want to take: ");  
		double loanAmount=Double.parseDouble(br.readLine());  

		System.out.print("\nEnter the number of years to pay your entire loan amount: ");  
		int years=Integer.parseInt(br.readLine());  

		System.out.println("\nYou are taking the Loan from "+ b.getBankName());  

		AbstractBankFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l=loanFactory.getLoan(loanName);
		l.getInterestRate(rate);  
		l.calculateLoanPayment(loanAmount,years);  
	}   
}