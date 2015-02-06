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
	public void should_build_sum_of_two_numbers() throws Exception {
		int result = calculator.add("1,65");
		assertEquals(66, result);
	}

	@Test
	public void should_build_sum_of_one_number() throws Exception {
		int result = calculator.add("1");
		assertEquals(1, result);
	}

	@Test
	public void should_return_zero_for_no_number() throws Exception {
		int result = calculator.add("");
		assertEquals(0, result);
	}

	@Test
	public void should_build_sum_of_multiple_numbers() throws Exception {
		int resultThreeNumbers = calculator.add("1,2,3");
		int resultFourNumbers = calculator.add("1,2,3,4");

		assertEquals(6, resultThreeNumbers);
		assertEquals(10, resultFourNumbers);
	}

	@Test
	public void should_cope_with_multiple_delimiters() throws Exception {
		int resultThreeNumbers = calculator.add("1\n2,3");

		assertEquals(6, resultThreeNumbers);
	}

	@Test
	public void should_cope_with_multiple_chosen_delimiters() throws Exception {
		int resultThreeNumbers = calculator.add("//\n\n1\n4");
		assertEquals(5, resultThreeNumbers);

		int resultThreeNumbersOtherDelimiter = calculator.add("//:\n1:4");
		assertEquals(5, resultThreeNumbersOtherDelimiter);

	}

	@Test(expected = Exception.class)
	public void should_throw_exception_when_negative_number_included()
			throws Exception {
		String input = "//:\n1:8:-3";
		int result = calculator.add(input);
	}

	@Test
	public void should_throw_exception_when_negative_number_included2() {
		String input = "//:\n1:8:-3";
		try {
			int result = calculator.add(input);
			fail();
		} catch (Exception e) {
			assertEquals(e.getMessage(),
					"Negative Zahlen sind nicht erlaubt. Folgende wurden gefunden: -3");
		}
	}

}
