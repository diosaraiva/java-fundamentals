package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppOptions{
	public static boolean runConsole(){
		Map<Integer,String> optionList = getOptionList();

		try{		
			String option = readUserOption();

			if(Integer.parseInt(option) == 0){
				displayExitProgram();

				return false;
			}

			System.out.print(new StringBuilder()
					.append("\n----------------[ OUTPUT: <")
					.append(option));
			option = optionList.get(Integer.parseInt(option));
			System.out.println(new StringBuilder()
					.append(". ")
					.append(option)
					.append("> ]----------------"));

			if(option != null) AppOptionsEnum.runOptionEnum(option);

			else displayInvalidOption();
		} catch (Exception e){
			displayError(e);
		} 

		pressToContinue();

		return true;
	}

	private static Map<Integer,String> getOptionList(){
		Map<Integer, String> optionList = new HashMap<Integer, String>();

		System.out.println(new StringBuilder()
				.append("----------------[ AVAILABLE OUTPUTS: ")
				.append(AppOptionsEnum.values().length)
				.append(" OPTIONS ]----------------"));

		int i = 0;
		for (AppOptionsEnum appOptionsEnum : AppOptionsEnum.values()){
			String appOption = appOptionsEnum.getEnumOption();
			optionList.put(++i, appOption);
			System.out.println(new StringBuilder()
					.append(i)
					.append(". ")
					.append(appOption));
		}

		System.out.println("\n0. EXIT PROGRAM");

		return optionList;
	}

	private static String readUserOption() throws IOException{
		System.out.print("\nEnter output option number: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		return br.readLine();
	}

	private static void pressToContinue(){
		System.out.println("\nPress ENTER to continue...");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}

	private static void displayExitProgram(){
		System.out.println("\n----------------[ EXITING PROGRAM ]----------------");
	}

	private static void displayError(Exception e){
		System.out.println(new StringBuilder()
				.append("\n[ ERROR: ")
				.append(e.toString())
				.append(" ]"));
	}

	private static void displayInvalidOption(){
		System.out.println("INVALID OPTION");
	}
}