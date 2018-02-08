package com.vmetry;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeoutTest {

	@Test(timeout = 1000)
	public void test() {
		int three = Timeout.loop(1);
		assertEquals(1, three, 0);
	}

}
