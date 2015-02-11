import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calculator;

	@Before
	public void setup() {
		calculator = new StringCalculator();
	}

	@Test
	public void sum_of_two_arguments() throws Exception {
		int sum = calculator.add("1,65");
		assertEquals(66, sum);
		
		sum = calculator.add("0,799");
		assertEquals(799, sum);
	}

	@Test
	public void sum_of_one_argument() throws Exception {
		int sum = calculator.add("5");
		assertEquals(5, sum);
	}

	@Test
	public void sum_of_no_arguments() throws Exception {
		int sum = calculator.add("");
		assertEquals(0, sum);
	}

	@Test
	public void sum_of_3_or_more_arguments() throws Exception {
		int sum = calculator.add("1,2,3");
		assertEquals(6, sum);
		
		sum = calculator.add("1,2,3,4");
		assertEquals(10, sum);
		
		int n = 100;
		String inputString = "1";
		for (int i = 2; i <= n; i++) {
			inputString += "," + String.valueOf(i);
		}
		sum = calculator.add(inputString);
		assertEquals((n+1)*(n/2), sum);
	}

	@Test
	public void using_multiple_delimiters() throws Exception {
		int sum = calculator.add("1\n2,3");
		assertEquals(6, sum);
		
		sum = calculator.add("1,5\n2,3");
		assertEquals(11, sum);
	}

	@Test
	public void explicit_delimiter_selection() throws Exception {
		int sum = calculator.add("//\n\n1\n4");
		assertEquals(5, sum);

		sum = calculator.add("//:\n1:4");
		assertEquals(5, sum);
		
		// also consider regex escaping characters:
		
		sum = calculator.add("//$\n99$743$5$89");
		assertEquals(99+743+5+89, sum);
		
		sum = calculator.add("//\\\n99\\743\\5\\89");
		assertEquals(99+743+5+89, sum);
	}

	@Test
	public void throw_exception_for_negative_arguments() {
		String input = "//:\n1:8:-3";
		try {
			calculator.add(input);
			fail();
		} catch (Exception e) {
			assertEquals(
					"Negative Zahlen sind nicht erlaubt. Folgende wurden gefunden: -3",
					e.getMessage());
		}
		
		input = "//:\n-1:8:-3:7";
		try {
			calculator.add(input);
			fail();
		} catch (Exception e) {
			assertEquals(
					"Negative Zahlen sind nicht erlaubt. Folgende wurden gefunden: -1, -3",
					e.getMessage());
		}
	}
	
}
