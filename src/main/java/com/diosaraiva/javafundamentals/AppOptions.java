package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppOptions {
	public static void showOptions(){
		System.out.println("\n\nAvailable Outputs:");
		System.out.println("1. design-patterns/creational/factorymethod");
		System.out.println("2. design-patterns/creational/builder");
		System.out.println("\n0. EXIT");
		System.out.print("\nSelect your output option: ");
	}
	
	public static int getOption() throws NumberFormatException, IOException{
		int option = 0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		option=Integer.parseInt(br.readLine());
		System.out.println();
		
		return option;
	}
}