package com.diosaraiva.javafundamentals;

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

public class App{
	public static void main(String[] args){
		boolean loop = true;

		try {
			while(loop){
				switch (AppOptions.getUserOption()){
				case 0: loop = false; 						AppOptions.exitProgram(); break;

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
				case 11: Bridge.askQuestions();				AppOptions.pressToContinue(); break;
				case 12: Composite.getCashiers();			AppOptions.pressToContinue(); break;
				case 13: Decorator.orderFood();				AppOptions.pressToContinue(); break;
				case 14: Facade.getMobileShop();			AppOptions.pressToContinue(); break;
				case 15: Proxy.grantAccess();				AppOptions.pressToContinue(); break;
				case 16: PropertiesUtils.ReadProperties();	AppOptions.pressToContinue(); break;

				default: AppOptions.getInvalidOption(); break;
				}
			}
		} catch (Exception e){
			AppOptions.getError(e);
			AppOptions.exitProgram();
		}
	}
}
