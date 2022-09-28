package study11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testtestcase {
	testcase ob;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ob = new testcase();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		
		int x =-9 , y =-7;
		int e  =- 16;
		int a = ob.add(x, y);
		assertTrue("the e not eqal a",e==a);
	}
	@Test
	public void testp() {
		
		
		int x =9 , y =7;
		int e  = 16;
		int a = ob.add(x, y);
		assertTrue("the e not eqal a",e==a);
	}

}
