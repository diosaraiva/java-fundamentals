package com.diosaraiva.javafundamentals.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.diosaraiva.javafundamentals.App;

public class PropertiesUtils{
	public static void ReadProperties(){
		try{
			InputStream input = App.class.getClassLoader().getResourceAsStream("app.properties");
			if (input == null) System.out.println("Unable to find file.");

			//load a properties file from class path, inside static method
			Properties prop = new Properties();
			prop.load(input);

			//get the property value and print it out
			System.out.println(prop.getProperty("db.user"));
			System.out.println(prop.getProperty("db.password"));
			System.out.println(prop.getProperty("db.string"));
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}