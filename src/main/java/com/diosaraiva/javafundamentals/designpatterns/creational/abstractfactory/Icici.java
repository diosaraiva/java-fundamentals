package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

class Icici implements Bank{  
	private final String BNAME;  
	public Icici(){  
		BNAME="ICICI BANK";  
	}  
	public String getBankName(){  
		return BNAME;  
	}  
}