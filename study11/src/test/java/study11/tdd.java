package study11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class tdd {
    cal c;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new cal() ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void add() {
		int x=9 , y=3;
		int a = c.add(x,y);
		int e = 12;
		
		assertTrue((e==a));
	}
	
	@Test
	public void sub() {
		int x=9 , y=3;
		int a = c.sub(x,y);
		int e = 6;
		
		assertTrue((e==a));
	}


}
