package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		
		HelloWorld helloWorld = new HelloWorld();
		String actual = helloWorld.getMessage();
	    String expected = "Hello World!";
	    assertEquals(actual,expected);
	}

}
