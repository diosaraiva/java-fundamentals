package com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory;

abstract class AbstractBankFactory{  
	public abstract Bank getBank(String bank);  
	public abstract Loan getLoan(String loan);  
} 