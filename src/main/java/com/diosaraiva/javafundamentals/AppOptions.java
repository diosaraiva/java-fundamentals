package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

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
import com.diosaraiva.javafundamentals.properties.PropertiesUtils;

public class AppOptions{
	public static boolean runConsole(){
		Set<Entry<Integer, String>> optionList = getOptionList().entrySet();
		System.out.println("----------------[ AVAILABLE OUTPUTS: " + optionList.size() + " OPTIONS ]----------------");
		optionList.stream().forEach(item -> System.out.println(item.getKey() + ". " + item.getValue()));

		System.out.println("\n0. EXIT PROGRAM");

		System.out.print("\nEnter output option number: ");

		try{
			switch (readUserOption()){
			case 0:	exitProgram(); return false;

			case 1: FactoryMethod.GenerateBill();		pressToContinue(); return true;
			case 2: Builder.BuildCds(); 				pressToContinue(); return true;
			case 3: AbstractFactory.GetLoan();			pressToContinue(); return true;
			case 4: PrototypePattern.PrintRecords();	pressToContinue(); return true;
			case 5: ObjectPoolPattern.TestObjectPool();	pressToContinue(); return true;
			case 6: Adapter.GetCreditCard();			pressToContinue(); return true;
			case 7: Lists.printArrayList();				pressToContinue(); return true;
			case 8: Lists.printLinkedList();			pressToContinue(); return true;
			case 9: Lists.printVector();				pressToContinue(); return true;
			case 10: Lists.printStack();				pressToContinue(); return true;
			case 11: Bridge.askQuestions();				pressToContinue(); return true;
			case 12: Composite.getCashiers();			pressToContinue(); return true;
			case 13: Decorator.orderFood();				pressToContinue(); return true;
			case 14: Facade.getMobileShop();			pressToContinue(); return true;
			case 15: Proxy.grantAccess();				pressToContinue(); return true;
			case 16: PropertiesUtils.ReadProperties();	pressToContinue(); return true;

			default: getInvalidOption(); return true;
			}
		} catch (Exception e){
			getError(e);
			return true;
		}
	}

	private static Map<Integer,String> getOptionList(){
		Map<Integer, String> optionList = new HashMap<Integer, String>();
		int i = 0;
		optionList.put(++i, "design-patterns/creational/factorymethod");
		optionList.put(++i, "design-patterns/creational/builder");
		optionList.put(++i, "design-patterns/creational/abstractfactory");
		optionList.put(++i, "design-patterns/creational/prototype");
		optionList.put(++i, "design-patterns/creational/objectpool");
		optionList.put(++i, "design-patterns/structural/adapter");
		optionList.put(++i, "interfaces/collection/arraylist");
		optionList.put(++i, "interfaces/collection/linkedlist");
		optionList.put(++i, "interfaces/collection/vector");
		optionList.put(++i, "interfaces/collection/stack");
		optionList.put(++i, "design-patterns/structural/bridge");
		optionList.put(++i, "design-patterns/structural/composite");
		optionList.put(++i, "design-patterns/structural/decorator");
		optionList.put(++i, "design-patterns/structural/facade");
		optionList.put(++i, "design-patterns/structural/proxy");
		optionList.put(++i, "properties/read");

		return optionList;
	}

	private static int readUserOption(){
		try{
			//Read user input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(br.readLine());
			
			if(option!=0) System.out.println("\n----------------[ OUTPUT: <" + option + ". " + getOptionList().get(option) + "> ]----------------");
			
			return option;
		} catch (Exception e){
			//if error, invalid option!
			return 999;
		}
	}

	private static void pressToContinue(){
		System.out.println("\nPress ENTER to continue...");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}

	private static void getInvalidOption(){
		System.out.println("INVALID OPTION\n");
	}

	private static void getError(Exception e){
		System.out.println("\n[ ERROR: " + e.toString() + " ]\n");
	}

	private static void exitProgram(){
		System.out.println("\n----------------[ EXITING PROGRAM ]----------------");
	}
}