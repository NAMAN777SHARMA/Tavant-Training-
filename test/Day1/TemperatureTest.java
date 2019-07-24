package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		
		double actual1 = Temperature.convertToCelcius(100);
		double expected1 = 37.77777777777778;
		assertEquals(actual1, expected1);
		
		double actual2 = Temperature.convertToFarenheit(20);
		double expected2 = 68.0;
		assertEquals(actual2, expected2);
	}
}

