package com.diosaraiva.javafundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DemoServiceTest {

	@Test
	void addTest() {
		DemoService demoService = new DemoService();
		
		int result = demoService.add(100, 200);
		assertEquals(300, result);
	}
	
	@Test
	void concatTest() {
		DemoService demoService = new DemoService();
		
		String result = demoService.concat("a", "b");
		assertEquals("ab", result);
	}
}
