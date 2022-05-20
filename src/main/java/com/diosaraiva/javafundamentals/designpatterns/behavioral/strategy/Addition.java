package com.diosaraiva.javafundamentals.designpatterns.behavioral.strategy;

public class Addition implements Strategy{
	@Override  
	public float calculation(float a, float b) {  
		return a+b;  
	}
}