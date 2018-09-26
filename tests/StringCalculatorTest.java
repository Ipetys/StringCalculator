import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		StringCalculator calc = new StringCalculator();
		
		calc.add("5,2");
		int sum = calc.returnSum();
		assertEquals("Sum 5+2", 7, sum);
	}
	
	@Test
	public void test_3_numbers() {
		StringCalculator calc = new StringCalculator();
		
		calc.add("1,2,3");
		int sum2 = calc.returnSum();
		assertEquals("Sum 1+2+3", 6, sum2);		
	}

	@Test
	public void test_3_numbers_delimiters() {
		StringCalculator calc = new StringCalculator();
		
		String testWord = calc.replacer("5\n5");
		
		assertEquals("5\n5", "5,5", testWord);
		
	}	
	
	@Test
	public void test_3_numbers_different_delimiters() {
		StringCalculator calc = new StringCalculator();
		
		calc.add("1\n2,3");
		int sum2 = calc.returnSum();
		assertEquals("Sum 1+2+3", 6, sum2);		
	}	
	
}
