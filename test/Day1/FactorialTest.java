package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() 
	{
		Factorial f = new Factorial();
		int result = f.calculateFactorial(5);
		assertEquals(120,result);
	}

}
