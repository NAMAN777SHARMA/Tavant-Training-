package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test() {
		MarkValidator mark = new MarkValidator();
		String result1 = mark.isPass(78);
		assertEquals("Pass",result1);
	    String result2 = mark.markGrade(78);
	    assertEquals("grade B",result2);
	}

}
