package com.diosaraiva.javafundamentals.designpatterns.behavioral.template;

public abstract class Game {  
	abstract void initialize();  
	abstract void start();  
	abstract void end();  

	public final void play(){  
		//initialize the game  
		initialize();  

		//start game  
		start();  

		//end game  
		end();  
	}  
}