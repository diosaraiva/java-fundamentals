package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class AppOptions{
	public static Map<Integer,String> getOptionList(){
		Properties prop = new Properties();

		/*
		try {
			//prop.load(new FileInputStream("src/main/resources/app.properties"));
			prop.load(App.class.getResourceAsStream("resources/app.properties"));
			System.out.println(prop.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}*/


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
		optionList.put(11, "design-patterns/structural/adapter");
		optionList.put(12, "design-patterns/structural/composite");

		return optionList;
	}

	public static int getUserOption(){
		System.out.println("----------------[ AVAILABLE OUTPUTS ]----------------");

		Set<Entry<Integer, String>> optionList = getOptionList().entrySet();
		optionList.stream().forEach(item -> System.out.println(item.getKey() + ". " + item.getValue()));

		System.out.println("\n0. EXIT PROGRAM");

		System.out.print("\nSelect your output option: ");

		int option;
		try{
			//Read user input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			option=Integer.parseInt(br.readLine());
		} catch (Exception e){
			//if error, invalid option!
			option = 999;
		}

		if(option!=0) System.out.println("\n----------------[ OUTPUT: <" + option + ". " + getOptionList().get(option) + "> ]----------------");

		return option;
	}

	public static void pressToContinue(){
		System.out.println("\nPress ENTER to continue...");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}

	public static void getInvalidOption(){
		System.out.println("INVALID OPTION\n");
	}

	public static void getError(Exception e){
		System.out.println("\n[ ERROR: " + e.toString() + " ]");
	}

	public static void exitProgram(){
		System.out.println("\n----------------[ EXITING PROGRAM ]----------------\n");
	}
}