package com.diosaraiva.javafundamentals;

import java.io.IOException;

import com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory.AbstractFactory;
import com.diosaraiva.javafundamentals.designpatterns.creational.builder.Builder;
import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethod;
import com.diosaraiva.javafundamentals.designpatterns.creational.objectpool.ObjectPoolPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.prototype.PrototypePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.adapter.Adapter;
import com.diosaraiva.javafundamentals.interfaces.collection.Lists;

public class App{
	public static void main(String[] args) throws IOException{
		boolean loop = true;

		try {
			while(loop){
				switch (AppOptions.getUserOption()){
				case 0: loop = false; break;

				case 1: FactoryMethod.GenerateBill();		AppOptions.pressToContinue(); break;
				case 2: Builder.BuildCds(); 				AppOptions.pressToContinue(); break;
				case 3: AbstractFactory.GetLoan();			AppOptions.pressToContinue(); break;
				case 4: PrototypePattern.PrintRecords();	AppOptions.pressToContinue(); break;
				case 5: ObjectPoolPattern.TestObjectPool();	AppOptions.pressToContinue(); break;
				case 6: Adapter.GetCreditCard();			AppOptions.pressToContinue(); break;
				case 7: Lists.printArrayList();				AppOptions.pressToContinue(); break;
				case 8: Lists.printLinkedList();			AppOptions.pressToContinue(); break;
				case 9: Lists.printVector();				AppOptions.pressToContinue(); break;
				case 10: Lists.printStack();				AppOptions.pressToContinue(); break;

				default: System.out.println("INVALID OPTION\n"); break;
				}
			}
		} catch (Exception e){
			System.out.println("\n[ERROR: " + e.toString() + "]");
		}
	}
}    
