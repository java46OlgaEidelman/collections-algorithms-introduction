package telran.recursion.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.recursion.LineRecursion.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class RecursionTest {

	@Before
	void setUp() throws Exception {
	}
    @Test
    void factorialTest() {
	 assertEquals(24,factorial(4));
 }
    @Test
    void powTest() {
    	assertEquals(1000, pow(10,  3));
    	assertEquals(1000, pow(10,  3));
    }
    
    @Test
    void sumTest() {
    	int ar[] = {1, 2, 3, 4};
    	assertEquals(10, sum(ar));
    	
    }
    @Test
	void squareTest() {
		assertEquals(100, square(10));
		assertEquals(100, square(-10));
	}
//	@Test
//	void test() {
//	   f();
//	}
//
//	private void f() {
//	if(Math.random() < 0.5) {
//		f();
//	}
//		
//	}
	

}
