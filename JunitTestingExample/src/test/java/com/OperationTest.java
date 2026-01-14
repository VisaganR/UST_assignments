package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testAdd() {
		Operation op = new Operation();
		int result = op.add(10, 20);
		assertEquals(30, result); 
	}

	@Test
	public void testSub() {
		Operation op = new Operation();
		int result = op.sub(10, 20);
		assertEquals(-10, result); 
	}

}