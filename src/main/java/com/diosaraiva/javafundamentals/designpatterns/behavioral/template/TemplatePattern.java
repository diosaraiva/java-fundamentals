package com.diosaraiva.javafundamentals.designpatterns.behavioral.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".

 Benefits:
 - It is very common technique for reusing the code.This is only the main benefit of it.

 Usage:
 - It is used when the common behavior among sub-classes should be moved to a single common class by avoiding the duplication.

 https://www.javatpoint.com/template-pattern
 */
public class TemplatePattern{  
	public static void TemplatePatternDemo() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{  
		System.out.print("Which game would you like to play? [1.Chess, 2.Soccer]: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
		String gameOption=br.readLine();

		if(gameOption.equals("1") || gameOption.equals("Chess")) gameOption="com.diosaraiva.javafundamentals.designpatterns.behavioral.template.Chess";
		if(gameOption.equals("2") || gameOption.equals("Soccer")) gameOption="com.diosaraiva.javafundamentals.designpatterns.behavioral.template.Soccer";

		Class c = Class.forName(gameOption);
		Game game = (Game)c.newInstance();
		game.play();		
	}  
}