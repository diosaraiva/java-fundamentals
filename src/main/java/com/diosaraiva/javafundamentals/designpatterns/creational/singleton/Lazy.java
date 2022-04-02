package com.diosaraiva.javafundamentals.designpatterns.creational.singleton;

class Lazy{  
	private static Lazy obj;  
	private Lazy(){}  

	public static Lazy getLazy(){  
		if (obj == null){  
			synchronized(Lazy.class){  
				if (obj == null){  
					obj = new Lazy(); //instance will be created at request time  
				}  
			}              
		}  
		return obj;  
	}  

	public void doSomething(){  
		//write your code
	}
}  