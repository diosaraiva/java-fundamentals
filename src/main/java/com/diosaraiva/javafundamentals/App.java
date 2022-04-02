package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.diosaraiva.javafundamentals.designpatterns.creational.builder.Builder;
import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethod;

public class App {

	public static void main(String[] args) throws IOException{
		boolean loop = true;
		
		while(loop)
		{
			AppOptions.showOptions();

			switch (AppOptions.getOption()){
	
			case 0: loop = false; break;
			
			case 1: FactoryMethod.GenerateBill(); break;
			case 2: Builder.BuildCds(); break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			}
		}
	}    
}
