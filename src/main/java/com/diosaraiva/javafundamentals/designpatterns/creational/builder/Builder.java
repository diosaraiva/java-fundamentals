package com.diosaraiva.javafundamentals.designpatterns.creational.builder;

/*
 Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"

 It is mostly used when object can't be created in single step like in the de-serialization of a complex object.

 Advantage of Builder Design Pattern
 The main advantages of Builder Pattern are as follows:
 - It provides clear separation between the construction and representation of an object.
 - It provides better control over construction process.
 - It supports to change the internal representation of objects.

 https://www.javatpoint.com/builder-design-pattern
 */
public class Builder{
	public static void BuildCds() {  
		CdBuilder cdBuilder=new CdBuilder();  
		
		CdType cdType1=cdBuilder.buildSonyCD();  
		cdType1.showItems();  

		CdType cdType2=cdBuilder.buildSamsungCD();  
		cdType2.showItems();  
	}
}