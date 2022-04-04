package com.diosaraiva.javafundamentals;

import java.io.IOException;

import com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory.AbstractFactory;
import com.diosaraiva.javafundamentals.designpatterns.creational.builder.Builder;
import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethod;
import com.diosaraiva.javafundamentals.designpatterns.creational.objectpool.ObjectPoolPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.prototype.PrototypePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.adapter.Adapter;

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
				case 7: break;
				case 8: break;
				case 9: break;
				case 10: break;

				default: System.out.println("INVALID OPTION"); break;
				}
			}
		} catch (Exception e){
			System.out.println("\n[ERROR: " + e.toString() + "]");
		}
	}
}    
