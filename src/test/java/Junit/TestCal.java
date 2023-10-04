package Junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCal {
	Calculator c=new Calculator();
	Testu t=new Testu();
	@Before
	public void hi() {
		System.out.println("Hello");
	}
	@Test
	public void testadd() {
		c.add();
	}
	@Test
	public void testsub() {
		c.sub();
	}
	@Test
	public void testdiv() {
		System.out.println(c.divide());
	}
	@Test
	public void checkaddsub() {
		assertEquals(c.add(),c.sub());
	}
	@Test
	public void min() {
		int [] s= {15,25,85,96,};
		assertEquals(t.findmin(s),15);
	}
	@Test
	public void testmulp() {
		System.out.println(c.mul());
	}
	@Test
	public void Stringmax() {
		String [] v= {"asde","fdgdeaaaas","jshndjs","sdjbsgj"};
		assertEquals(t.findString(v),"fdgdeaaaas");
	}
	@After
	public void bye() {
		System.out.println("Bye");
	}
	

}
