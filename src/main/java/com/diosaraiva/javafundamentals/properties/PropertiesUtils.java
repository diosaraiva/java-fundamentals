package com.diosaraiva.javafundamentals.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.diosaraiva.javafundamentals.App;

/*
 Load a properties file from classpath
 Load a properties file config.properties from project classpath, and retrieved the property value.
 */
public class PropertiesUtils{
	public static void ReadProperties(){
		try (InputStream input = App.class.getClassLoader().getResourceAsStream("app.properties")){
			Properties prop = new Properties();

			if (input == null){
				System.out.println("Sorry, unable to find config.properties");
				return;
			}

			//load a properties file from class path, inside static method
			prop.load(input);

			//get the property value and print it out
			System.out.println(prop.getProperty("db.url"));
			System.out.println(prop.getProperty("db.user"));
			System.out.println(prop.getProperty("db.password"));

		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
}