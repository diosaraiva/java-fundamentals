package com.diosaraiva.javafundamentals.designpatterns.creational.builder;

public class CdBuilder{  
	public CdType buildSonyCD(){   
		CdType cds=new CdType();  
		cds.addItem(new Sony());  
		return cds;  
	}

	public CdType buildSamsungCD(){  
		CdType cds=new CdType();  
		cds.addItem(new Samsung());  
		return cds;  
	}  
}