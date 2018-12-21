package _02_gotta_catchem_all;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();

	// 1. This is an example of how one might test that an exception is thrown.
	// It tests that an IndexOutOfBoundsException is thrown
	@Test
	public void testIndexOOBException() {
		int[] vars = { 0, 1, 2, 3 };

		// try {
		// vars[0] = 4;
		// assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
		// vars[4] = 5;
		// fail("ArrayIndexOutOfBoundsException not thrown");
		// } catch (Exception e) {
		// e.printStackTrace();
		// assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
		// }
	}

	// 2. In the ExceptionMethods class, write a method called divide that takes
	// two doubles as parameters and returns their quotient as a double. This method
	// should throw an IllegalArgumentException if the denominator is 0.0.

	// 3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		Double zero = 0.0;

		try {
			em.divide(zero, zero);
			fail("IllegalArgumentException not thrown");
		} catch (IllegalArgumentException e) {
			System.out.println("yo");
		}
	}

	// 4. In the ExceptionMethods class, write a method called reverseString that
	// takes a String and returns the reverse of that String.
	// It should throw an IllegalStateException if the String passed in is empty

	// 5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		String blanc = "";
		try {
			em.mirror(blanc);
			fail("IllegalStateException not thrown");
		} catch (IllegalStateException e) {
			System.out.println("yoo");
		}
	}

}
