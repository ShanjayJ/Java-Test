package com.vmetry;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA("aphabetical");
		assertEquals(3, output);
	}

}
