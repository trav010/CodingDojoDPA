public class StringCalculator {

	public int add(String inputText) {
		int[] arguments = (new CalculatorInput(inputText)).getCalculatorArguments();
		return add(arguments);
	}

	private int add(int[] arguments) {
		int sum = 0;
		if (arguments == null || arguments.length == 0) {
			return sum;
		}

		ensureNumbersAreNotNegative(arguments);
		
		for (int number : arguments) {
			sum += number;
		}
		return sum;
	}

	private void ensureNumbersAreNotNegative(int[] numbers) {
		String negativeNumbersList = null;
		for (int number : numbers) {
			if (number < 0) {
				if (negativeNumbersList == null) {
					negativeNumbersList = Integer.toString(number);
				}
				else {
					negativeNumbersList += ", " + number;
				}
			}
		}
		
		if (negativeNumbersList != null) {
			throw new IllegalArgumentException(
					"Negative Zahlen sind nicht erlaubt. " +
					"Folgende wurden gefunden: " + negativeNumbersList);
		}
	}

}
