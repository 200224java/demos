package com.revature.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ArithmeticTest {
	
	private Arithmetic a = null;

	/*
	 * This method will be invoked before the test class is instantiated
	 * This is primarily used in order to set up the global test environment
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/*
	 * This method will be invoked after the entire the test class has completed
	 * running its tests.
	 * This is primarily used to clean up the global test environment
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/*
	 * This method will be invoked before each individual test case
	 * This is primarily used to set up specific test environments (or
	 * perhaps to reset the test environment)
	 */
	@Before
	public void setUp() throws Exception {
		a = new Arithmetic();
	}

	/*
	 * This will be invoked after each individual test case
	 * This is primarily used to reset the specific test environment
	 */
	@After
	public void tearDown() throws Exception {
	}

	/*
	 * This annotation defines an individual test case
	 */
	@Test
	public void testAdd() {
		assertEquals(15, a.add(5, 10));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(50, a.mult(5, 10));
	}
	
	@Test(expected = MyException.class)
	public void expectException() {
		a.divide(5, 0);
	}
	
	@Test
	public void testAdd2() {
		assertNotEquals(0, a.add(Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 1));
	}
	
	@Ignore
	@Test(timeout = 3000) // This test will fail if it does not complete within 3 seconds
	public void testTimeOut() {
		while(true) { }
	}
}
