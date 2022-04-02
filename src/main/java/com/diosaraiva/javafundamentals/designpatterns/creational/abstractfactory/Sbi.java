package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

class Sbi implements Bank{
	private final String BNAME;  

	public Sbi(){  
		BNAME="SBI BANK";  
	}  
	public String getBankName(){  
		return BNAME;  
	}  
}