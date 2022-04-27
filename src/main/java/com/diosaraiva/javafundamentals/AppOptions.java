package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory.AbstractFactory;
import com.diosaraiva.javafundamentals.designpatterns.creational.builder.Builder;
import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethod;
import com.diosaraiva.javafundamentals.designpatterns.creational.objectpool.ObjectPoolPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.prototype.PrototypePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.adapter.Adapter;
import com.diosaraiva.javafundamentals.designpatterns.structural.bridge.Bridge;
import com.diosaraiva.javafundamentals.designpatterns.structural.composite.Composite;
import com.diosaraiva.javafundamentals.designpatterns.structural.decorator.Decorator;
import com.diosaraiva.javafundamentals.designpatterns.structural.facade.Facade;
import com.diosaraiva.javafundamentals.designpatterns.structural.proxy.Proxy;
import com.diosaraiva.javafundamentals.interfaces.collection.Lists;
import com.diosaraiva.javafundamentals.utils.properties.PropertiesUtils;
import com.diosaraiva.javafundamentals.utils.regex.RegexUtils;

public class AppOptions{
	public static boolean runConsole(){
		Map<Integer,String> optionList = getOptionList();

		try{		
			String option = readUserOption();

			if(Integer.parseInt(option) == 0){
				displayExitProgram();

				return false;
			}

			System.out.print("\n----------------[ OUTPUT: <" + option);
			option = optionList.get(Integer.parseInt(option));
			System.out.println(". " + option + "> ]----------------");

			if(option != null){				
				switch (AppOptionsEnum.getEnum(option)){

				case PATTERNS_ABSTRACT: 	AbstractFactory.GetLoan();			break;
				case PATTERNS_BUILDER:		Builder.BuildCds(); 				break;
				case PATTERNS_FACTORY:		FactoryMethod.GenerateBill();		break;
				case PATTERNS_OBJECTPOOL: 	ObjectPoolPattern.TestObjectPool();	break;
				case PATTERNS_PROTOTYPE: 	PrototypePattern.PrintRecords();	break;
				case PATTERNS_ADAPTER: 		Adapter.GetCreditCard();			break;
				case PATTERNS_BRIDGE: 		Bridge.askQuestions();				break;
				case PATTERNS_COMPOSITE: 	Composite.getCashiers();			break;
				case PATTERNS_DECORATOR: 	Decorator.orderFood();				break;
				case PATTERNS_FACADE: 		Facade.getMobileShop();				break;
				case PATTERNS_PROXY: 		Proxy.grantAccess();				break;
				case COLLECTION_ARRAYLIST: 	Lists.printArrayList();				break;
				case COLLECTION_LINKEDLIST: Lists.printLinkedList();			break;
				case COLLECTION_STACK: 		Lists.printStack();					break;
				case COLLECTION_VECTOR: 	Lists.printVector();				break;
				case UTILS_PROPERTIESREAD: 	PropertiesUtils.ReadProperties();	break;
				case UTILS_REGEXISNUMERIC: 	RegexUtils.testIsNumeric();			break;

				}
			}
			else displayInvalidOption();
		} catch (Exception e){
			displayError(e);
		} 

		pressToContinue();

		return true;
	}

	private static Map<Integer,String> getOptionList(){
		Map<Integer, String> optionList = new HashMap<Integer, String>();

		System.out.println("----------------[ AVAILABLE OUTPUTS: " + AppOptionsEnum.values().length + " OPTIONS ]----------------");

		int i = 0;
		for (AppOptionsEnum appOptionsEnum : AppOptionsEnum.values()){
			String appOption = appOptionsEnum.getEnumOption();
			optionList.put(++i, appOption);
			System.out.println(i + ". " + appOption);
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
		System.out.println("\n[ ERROR: " + e.toString() + " ]");
	}

	private static void displayInvalidOption(){
		System.out.println("INVALID OPTION");
	}
}