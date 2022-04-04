package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppOptions{
	public static Map<Integer,String> getOptionList(){
		Map<Integer, String> optionList = new HashMap<Integer, String>();
		optionList.put(1, "design-patterns/creational/factorymethod");
		optionList.put(2, "design-patterns/creational/builder");
		optionList.put(3, "design-patterns/creational/abstractfactory");
		optionList.put(4, "design-patterns/creational/prototype");
		optionList.put(5, "design-patterns/creational/objectpool");
		optionList.put(6, "design-patterns/structural/adapter");
		optionList.put(7, "interfaces/collection/arraylist");
		optionList.put(8, "interfaces/collection/linkedlist");
		optionList.put(9, "interfaces/collection/vector");
		optionList.put(10, "interfaces/collection/stack");

		return optionList;
	}

	public static int getUserOption(){
		System.out.println("----------------[ AVAILABLE OUTPUTS ]----------------");

		for(var item : getOptionList().entrySet()){
			System.out.println(item.getKey()+". "+item.getValue());
		}
		System.out.println("\n0. EXIT PROGRAM");

		System.out.print("\nSelect your output option: ");
		int option;

		try{
			//Read user input
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			option=Integer.parseInt(br.readLine());
		} catch (Exception e){
			//if error, invalid option!
			option = 999;
		}

		if(option==0) System.out.println("\n----------------[ EXITING PROGRAM ]----------------");
		else System.out.println("\n----------------[ OUTPUT: OPTION <" + option + "> ]----------------");

		return option;
	}

	public static void pressToContinue(){
		System.out.println("\nPress ENTER to continue...");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}
}