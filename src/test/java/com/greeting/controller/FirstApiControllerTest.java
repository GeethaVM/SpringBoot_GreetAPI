package com.greeting.controller;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.greeting.controller.FirstApiController;

@SpringBootTest
public class FirstApiControllerTest {
	
	@InjectMocks
	FirstApiController firstApiController;
	
	@Test	 
	public void greetHelloTest() {
		String actualHello = "Hello World!!";
		String expectedHello = firstApiController.greetHello();		
		assertEquals(actualHello, expectedHello);		
	}
	
	@Test
	public void greetHelloWithNameTest() {
		String actualHelloWithName = "Hello Geetha !!";
		String expectedHelloWithName = firstApiController.greetHelloWithName("");		
		assertNotEquals(actualHelloWithName, expectedHelloWithName);		
	}
	
	@Test
	public void greetHelloWithNameSuccessTest() {
		String actualHelloWithName = "Hello Geetha !!";
		String expectedHelloWithName = firstApiController.greetHelloWithName("Geetha");		
		assertEquals(actualHelloWithName, expectedHelloWithName);		
	}

}
