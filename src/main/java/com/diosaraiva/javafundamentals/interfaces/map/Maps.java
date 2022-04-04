package com.diosaraiva.javafundamentals.interfaces.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;

/*
 
 */
public class Maps{
	/*
	 
	 */
	Map mapA = new HashMap();
	
	/*
	 
	 */
	Map mapB = new Hashtable();
	
	/*
	 
	 */
	Map mapC = new LinkedHashMap();
	
	/*
	 
	 */
	Map mapD = new Properties();
	
	/*
	 
	 */
	Map mapE = new TreeMap();
	
	/*
	 
	 */
	Map mapF = new WeakHashMap();
	
	/*
	 
	 */
	Map<String, String> mapG = new HashMap<String, String>();
}