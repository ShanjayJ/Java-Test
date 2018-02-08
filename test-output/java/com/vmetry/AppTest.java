package com.vmetry;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App test = new App();
		String output = test.sample("sample");
		assertEquals("sample", output);
	}

}
