package com.vmetry;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AssertNull {

	@Test
	public void test() {
		ArrayList b= NullPoint.Initilizer(0);
		assertNull(b);
	}

}
