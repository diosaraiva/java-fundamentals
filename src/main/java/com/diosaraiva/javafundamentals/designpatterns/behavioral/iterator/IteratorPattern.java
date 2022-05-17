package com.diosaraiva.javafundamentals.designpatterns.behavioral.iterator;

public class IteratorPattern{
	public static void PrintNames(){
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		} 	
	}
}