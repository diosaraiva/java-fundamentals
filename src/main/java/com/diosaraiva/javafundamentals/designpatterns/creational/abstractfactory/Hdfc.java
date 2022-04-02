package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

class Hdfc implements Bank{  
	private final String BNAME;  
	
	public Hdfc(){  
		BNAME="HDFC BANK";  
	}
	
	public String getBankName(){  
		return BNAME;  
	}  
} 