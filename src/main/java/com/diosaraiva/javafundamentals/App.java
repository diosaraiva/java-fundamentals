package com.diosaraiva.javafundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethod;

public class App {

	public static void main(String[] args) throws IOException{
		boolean loop = true;
		int option = 0;
		
		while(loop)
		{
			AppOptions.showOptions();

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			option=Integer.parseInt(br.readLine());

			switch (option){
			case 0: {
				loop = false;
				break;
			}
			case 1: FactoryMethod.GenerateBill(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			default: break;			
			}
		}
	}    
}
