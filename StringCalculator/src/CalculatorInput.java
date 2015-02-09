import java.util.ArrayList;
import java.util.regex.Pattern;


public class CalculatorInput {

	private static final char DEFAULT_DELIMITER_1 = ',';
	private static final char DEFAULT_DELIMITER_2 = '\n';
	
	private static final String DELIMITER_LINE_PREFIX = "//";
	
	private char delimiter = DEFAULT_DELIMITER_1;
	private boolean useDefaultDelimiters = true;

	private int[] parsedNumbers = null;

	public CalculatorInput(String textToParse) {
		parsedNumbers = parseNumbers(textToParse);
	}

	public int[] getCalculatorArguments() {
		return this.parsedNumbers;
	}

	private int[] parseNumbers(String inputText) {
		String numbersSequence = parseDelimiterAndReturnNumbersSequence(inputText);
		String[] numberStrings = splitNumbersSequence(numbersSequence);
		return convertNumbers(numberStrings);
	}
	
	private String parseDelimiterAndReturnNumbersSequence(String inputText) {
		String numbersSequence = inputText;
		if (inputText.startsWith(DELIMITER_LINE_PREFIX)) {
			this.useDefaultDelimiters = false;
			this.delimiter = inputText.charAt(DELIMITER_LINE_PREFIX.length());
			numbersSequence = inputText.substring(DELIMITER_LINE_PREFIX.length() + 2);
		}
		return numbersSequence;
	}
	
	private String[] splitNumbersSequence(String numbersSequence) {
		if (useDefaultDelimiters) {
			ArrayList<String> numbers = new ArrayList<String>();
			for (String numbersSubstring : splitString(numbersSequence, DEFAULT_DELIMITER_1)) {
				for (String number : splitString(numbersSubstring, DEFAULT_DELIMITER_2)) {
					if (number.length() > 0) {
						numbers.add(number);
					}
				}
			}
			return numbers.toArray(new String[numbers.size()]);
		}
		else {
			return splitString(numbersSequence, this.delimiter);
		}
	}
	
	private String[] splitString(String stringToSplit, char delimiter) {
		return Pattern.compile(String.valueOf(delimiter), Pattern.LITERAL)
					.split(stringToSplit);
	}
	
	private int[] convertNumbers(String[] numbersAsText) {
		int[] numbers = new int[numbersAsText.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numbersAsText[i]);
		}
		return numbers;
	}
	
}
