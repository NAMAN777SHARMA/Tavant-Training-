package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test()
	{
		SumOfNumbers s = new SumOfNumbers();
		int result1 = s.sumOfEvenNumbers(10,20);
		assertEquals(90,result1);
		int result2 = s.sumOfOddNumbers(10,20);
		assertEquals(75,result2);
	}
}
