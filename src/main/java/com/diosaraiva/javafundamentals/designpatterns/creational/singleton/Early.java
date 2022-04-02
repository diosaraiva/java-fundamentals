package com.diosaraiva.javafundamentals.designpatterns.creational.singleton;

class Early{  
	private static Early obj=new Early(); //Early, instance will be created at load time  
	private Early(){}  

	public static Early getA(){  
		return obj;  
	}
}  