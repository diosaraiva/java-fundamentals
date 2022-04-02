package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

class FactoryCreator{  
	public static AbstractBankFactory getFactory(String choice){  
		if(choice.equalsIgnoreCase("Bank")){  
			return new BankFactory();	
		} 

		else if(choice.equalsIgnoreCase("Loan")){  
			return new LoanFactory();  
		}  
		return null;  
	}  
}