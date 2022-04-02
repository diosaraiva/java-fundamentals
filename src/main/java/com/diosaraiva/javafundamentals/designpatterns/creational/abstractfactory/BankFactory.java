package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

class BankFactory extends AbstractBankFactory{  
	public Bank getBank(String bank){  
		if(bank == null){  
			return null;  
		}

		if(bank.equalsIgnoreCase("HDFC")){  
			return new Hdfc();  
		} else if(bank.equalsIgnoreCase("ICICI")){  
			return new Icici();  
		} else if(bank.equalsIgnoreCase("SBI")){  
			return new Sbi();  
		}
		
		return null;  
	}  

	public Loan getLoan(String loan){  
		return null;  
	}  
}