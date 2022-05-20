package com.diosaraiva.javafundamentals.designpatterns.behavioral.iterator;

/*
 According to GoF, Iterator Pattern is used "to access the elements of an aggregate object sequentially without exposing its underlying implementation".

 The Iterator pattern is also known as Cursor.

 In collection framework, we are now using Iterator that is preferred over Enumeration.

 java.util.Iterator interface uses Iterator Design Pattern.

 Advantage of Iterator Pattern
 - It supports variations in the traversal of a collection.
 - It simplifies the interface to the collection.

 Usage of Iterator Pattern:
 It is used:
 - When you want to access a collection of objects without exposing its internal representation.
 - When there are multiple traversals of objects need to be supported in the collection.
 */
public class IteratorPattern{
	public static void IteratorPatternDemo(){
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		} 	
	}
}