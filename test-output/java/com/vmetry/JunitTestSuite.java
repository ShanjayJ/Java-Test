package com.vmetry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, AppTest.class, AssertNull.class, CountATest.class, SquareTest.class,
		TimeoutTest.class })
public class JunitTestSuite {

}
