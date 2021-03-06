package com.diosaraiva.javafundamentals.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestingServiceTest{
	@Test
	void addTest(){
		TestingService testService = new TestingService();
		
		assertEquals(300, testService.add(100, 200));
	}
	
	@Test
	void concatTest(){
		TestingService testService = new TestingService();
		
		assertEquals("ab", testService.concat("a", "b"));
	}
}