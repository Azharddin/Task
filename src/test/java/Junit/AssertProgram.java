package Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class AssertProgram {
	@Test
	public void testAssentEquals() {
		assertEquals(10,10);
	}
	@Test
	public void testAssentNotEquals() {
		assertNotEquals(1,10);
	}
	@Test
	public void testAssertTrue() {
		boolean a=10>7;
		assertTrue(a);
	}
	@Test
	public void testAssertFalse() {
		boolean a=10>7;
		assertTrue(a);
	}
	@Test
	public void testSame() {
		assertSame("Nisha", "Nisha");
	}
	@Test
	public void testNotSame() {
		assertNotSame("Nisha", "Usha");
	}
	@Test
	public void testNull() {
		assertNull(null,null);
	}
	@Test
	public void testNotNull() {
		assertNotNull("abc","Nisha");
	}
	@Test
	public void testArrayEquals() {
		int [] a= {5,10,15}; 
		int [] b= {5,10,15}; 
		assertArrayEquals(a,b);
	}


}
