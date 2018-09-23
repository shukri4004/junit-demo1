package core;

import junit.framework.TestCase;
public class Arithmetic_op_test extends TestCase {

	public void testAdd() {
	
		Arithmetic_op solver = new Arithmetic_op();
		assertEquals(8, solver.add(5,3));
	}
	

	
	public void testMultiply() {
	
		Arithmetic_op solver = new Arithmetic_op();
		assertEquals(12, solver.multiply(4,3));
	}

	
}
