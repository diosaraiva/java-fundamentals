package com.diosaraiva.javafundamentals.designpatterns.behavioral.command;

/*
A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

It is also known as Action or Transaction.

Advantage of command pattern
- It separates the object that invokes the operation from the object that actually performs the operation.
- It makes easy to add new commands, because existing classes remain unchanged.

Usage of command pattern:
It is used:
- When you need parameterize objects according to an action perform.
- When you need to create and execute requests at different times.
- When you need to support rollback, logging or transaction functionality.

https://www.javatpoint.com/command-pattern
 */
public class CommandPattern{
	public static void CommandDemo(){
		Document doc = new Document();  

		ActionListenerCommand clickOpen = new ActionOpen(doc);  
		ActionListenerCommand clickSave = new ActionSave(doc);  

		MenuOptions menu = new MenuOptions(clickOpen, clickSave);  

		menu.clickOpen();  
		menu.clickSave();  
	}
}  