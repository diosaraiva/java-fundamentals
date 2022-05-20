package com.diosaraiva.javafundamentals.designpatterns.behavioral.memento;

/*
 A Memento Pattern says that "to restore the state of an object to its previous state". But it must do this without violating Encapsulation. Such case is useful in case of error or failure.

 The Memento pattern is also known as Token.

 Undo or backspace or ctrl+z is one of the most used operation in an editor. Memento design pattern is used to implement the undo operation. This is done by saving the current state of the object as it changes state.

 Benefits:
 - It preserves encapsulation boundaries.
 - It simplifies the originator.

 Usage:
 - It is used in Undo and Redo operations in most software.
 - It is also used in database transactions.
 
 https://www.javatpoint.com/memento-pattern
 */
public class MementoPattern {  
	public static void saveMemento(){  
		Originator originator = new Originator();  

		Caretaker careTaker = new Caretaker();  

		originator.setState("State #1");  
		careTaker.add(originator.saveStateToMemento());  
		originator.setState("State #2");  
		careTaker.add(originator.saveStateToMemento());  
		originator.setState("State #3");  
		careTaker.add(originator.saveStateToMemento());  
		originator.setState("State #4");  

		System.out.println("Current State: " + originator.getState());          
		originator.getStateFromMemento(careTaker.get(0));  
		System.out.println("First saved State: " + originator.getState());  
		originator.getStateFromMemento(careTaker.get(1));  
		System.out.println("Second saved State: " + originator.getState());  
		originator.getStateFromMemento(careTaker.get(2));  
		System.out.println("Third saved State: " + originator.getState());  
	}  
}