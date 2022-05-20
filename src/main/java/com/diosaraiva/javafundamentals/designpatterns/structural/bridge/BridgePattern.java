package com.diosaraiva.javafundamentals.designpatterns.structural.bridge;

/*
 A Bridge Pattern says that just "decouple the functional abstraction from the implementation so that the two can vary independently".

 The Bridge Pattern is also known as Handle or Body.

 Advantage of Bridge Pattern
 - It enables the separation of implementation from the interface.
 - It improves the extensibility.
 - It allows the hiding of implementation details from the client.

 Usage of Bridge Pattern
 - When you don't want a permanent binding between the functional abstraction and its implementation.
 - When both the functional abstraction and its implementation need to extended using sub-classes.
 - It is mostly used in those places where changes are made in the implementation does not affect the clients.

 https://www.javatpoint.com/bridge-pattern
 */
public class BridgePattern{
	public static void BridgePatternDemo(){  
		QuestionFormat questions = new QuestionFormat("Java Programming Language");
		questions.q = new JavaQuestions();  
		questions.delete("what is class?");
		questions.display();
		questions.newOne("What is inheritance? ");

		questions.newOne("How many types of inheritance are there in java?");
		questions.displayAll();  
	}
}