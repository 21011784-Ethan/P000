import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 9999;
		assertEquals (expected, actual);
		}
	
	@Test
	void testSubtract() {
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = -7531;
		assertEquals (expected, actual);
		}
	
	@Test
	void testMultiply() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = (1234 * 8765);
		assertEquals (expected, actual);
		}
	
	@Test
	void testDivide() {
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = (1234 / 8765);
		assertEquals (expected, actual);
		}

}
