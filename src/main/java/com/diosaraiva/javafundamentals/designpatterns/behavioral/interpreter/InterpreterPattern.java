package com.diosaraiva.javafundamentals.designpatterns.behavioral.interpreter;

/*
 An Interpreter Pattern says that "to define a representation of grammar of a given language, along with an interpreter that uses this representation to interpret sentences in the language".

 Basically the Interpreter pattern has limited area where it can be applied. We can discuss the Interpreter pattern only in terms of formal grammars but in this area there are better solutions that is why it is not frequently used.

 This pattern can applied for parsing the expressions defined in simple grammars and sometimes in simple rule engines.
 SQL Parsing uses interpreter design pattern.

 Advantage of Interpreter Pattern
 - It is easier to change and extend the grammar.
 - Implementing the grammar is straightforward.

 Usage of Interpreter pattern:
 It is used:
 - When the grammar of the language is not complicated.
 - When the efficiency is not a priority.

 https://www.javatpoint.com/command-pattern
 */
public class InterpreterPattern{
	public static void InterpreterPatternDemo(){
		String infix = "a+b*c";  

		InfixToPostfixPattern ip=new InfixToPostfixPattern();  

		String postfix = ip.conversion(infix);  
		System.out.println("Infix:   " + infix);  
		System.out.println("Postfix: " + postfix);  
	}
}  