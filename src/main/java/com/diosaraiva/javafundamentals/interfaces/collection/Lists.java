package com.diosaraiva.javafundamentals.interfaces.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/*
 List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.
 List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

 https://www.javatpoint.com/collections-in-java
 */
public class Lists{

	/*
	The ArrayList class implements the List interface. 
	It uses a dynamic array to store the duplicate element of different data types. 
	The ArrayList class maintains the insertion order and is non-synchronized. 
	The elements stored in the ArrayList class can be randomly accessed.
	 */
	List listA = new ArrayList();

	/*
	LinkedList implements the Collection interface.
	It uses a doubly linked list internally to store the elements.
	It can store the duplicate elements.
	It maintains the insertion order and is not synchronized.
	In LinkedList, the manipulation is fast because no shifting is required.
	 */
	List listB = new LinkedList();

	/*
	Vector uses a dynamic array to store the data elements.	It is similar to ArrayList. 
	However, It is synchronized and contains many methods that are not the part of Collection framework.
	 */
	List listC = new Vector();

	/*
	The stack is the subclass of Vector.
	It implements the last-in-first-out data structure, i.e., Stack.
	The stack contains all of the methods of Vector class and also provides its methods like 
	boolean push(), boolean peek(), boolean push(object o), which defines its properties.
	 */
	List listD = new Stack();

	/*
	Custom: generics usage
	 */
	List<String> listE = new ArrayList<String>();

	synchronized public static List getOutputList(List list){
		//Add
		list.add("1. Item A (new)");
		list.add("2. Item B (new)");
		list.add("3. Item C (new)");
		list.add("4. Item D (new)");
		
		//Stream: remove element
		list.removeIf((Object e) -> e.equals("4. Item D (new)"));

		return list;
	}
	
	public static void printAllLists(){
		Integer i = 0;
		System.out.println(new StringBuilder().append(++i).append(". ArrayList"));
		printArrayList();

		System.out.println(new StringBuilder().append(++i).append(". LinkedList"));
		printLinkedList();

		System.out.println(new StringBuilder().append(++i).append(". Vector"));
		printVector();

		System.out.println(new StringBuilder().append(++i).append(". Stack"));
		printStack();
	}

	public static void printList(List list){
		for(var item : list){
			System.out.println(item);
		}
	}

	public static void printArrayList(){
		List listA = new ArrayList();
		getOutputList(listA);
		printList(listA);
	}

	public static void printLinkedList(){
		List listB = new LinkedList();
		listB = getOutputList(listB);
		printList(listB);
	}

	public static void printVector(){
		List listC = new Vector();
		listC = getOutputList(listC);
		printList(listC);
	}

	public static void printStack(){
		List listD = new Stack();
		listD = getOutputList(listD);
		printList(listD);
	}
}