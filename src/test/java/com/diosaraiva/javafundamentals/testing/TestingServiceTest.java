package com.diosaraiva.javafundamentals.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestingServiceTest{
	@Test
	void addTest(){
		TestingService demoService = new TestingService();
		
		int result = demoService.add(100, 200);
		assertEquals(300, result);
	}
	
	@Test
	void concatTest(){
		TestingService demoService = new TestingService();
		
		String result = demoService.concat("a", "b");
		assertEquals("ab", result);
	}
}