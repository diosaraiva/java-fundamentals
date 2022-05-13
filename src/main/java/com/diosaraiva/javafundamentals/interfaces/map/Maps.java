package com.diosaraiva.javafundamentals.interfaces.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;

/*
 A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.

 A Map is useful if you have to search, update or delete elements on the basis of a key.

 https://www.javatpoint.com/java-map
 */
public class Maps{
	/*
	 HashMap is the implementation of Map, but it doesn't maintain any order.
	 */
	Map mapA = new HashMap();

	/*

	 */
	Map mapB = new Hashtable();

	/*
	 LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
	 */
	Map mapC = new LinkedHashMap();

	/*

	 */
	Map mapD = new Properties();

	/*
	 TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
	 */
	Map mapE = new TreeMap();

	/*

	 */
	Map mapF = new WeakHashMap();

	/*

	 */
	Map<String, String> mapG = new HashMap<String, String>();

	synchronized public static Map getOutputMap(Map map){
		//Add
		map.put("1","Item A (new)");
		map.put("2","Item B (new)");
		map.put("3","Item C (new)");
		map.put("4","Item D (new)");

		map.remove("4");

		return map;
	}

	public static void printMap(Map<String,String> map){
		for(Map.Entry<String,String> item : map.entrySet()){
			System.out.println(item);
		}
	}

	public static void printHashMap(){
		Map mapA = new HashMap();
		getOutputMap(mapA);
		printMap(mapA);
	}

	public static void printHashTable(){
		Map mapB = new Hashtable();
		getOutputMap(mapB);
		printMap(mapB);
	}

	public static void printLinkedHashMap(){
		Map mapC = new LinkedHashMap();
		getOutputMap(mapC);
		printMap(mapC);
	}

	public static void printProperties(){
		Map mapD = new Properties();
		getOutputMap(mapD);
		printMap(mapD);
	}

	public static void printTreeMap(){
		Map mapE = new TreeMap();
		getOutputMap(mapE);
		printMap(mapE);
	}

	public static void printWeakHashMap(){
		Map mapF = new WeakHashMap();
		getOutputMap(mapF);
		printMap(mapF);
	}
}