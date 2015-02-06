
public class StringCalculator {

	private static final String DELIMITER_PREFIX = "//";
	private static final int DELIMITER_LENGTH = 1;
	private static final String DELIMITER_SPLITTER = "\n";

	public int add(String inputText) throws Exception {
		//InputText input = new InputText(inputText);
				
		int sum = 0;

		if (inputText.isEmpty()) {
			return sum;
		}

		int[] numbers = parseNumbers(inputText);
		checkForNegativeNumbers(numbers);

		for (int element : numbers) {

			sum += element;
		}
		return sum;
	}

	private void checkForNegativeNumbers(int[] numbers) throws Exception {
		String negativeNumbers = null;
		for (int element : numbers) {
			if (element < 0) {
				if (negativeNumbers == null) {
					negativeNumbers = Integer.toString(element);
					continue;
				}
				negativeNumbers += "," + element;
			}
		}
		if (negativeNumbers != null) {
			throw new Exception(
					"Negative Zahlen sind nicht erlaubt. Folgende wurden gefunden: "
							+ negativeNumbers);
		}
		return;
	}

//	private int add(InputText input) {
//		int[] numbers= input.getLisdtOfNumbers();
//		
//	}
	
	private int[] parseNumbers(String inputText) {
//		String lineWithDelimiter = extractDelimiter(inputText);
//		String delimiter = parseDelimiter(inputText);
//	    String textNumbers = extractNumbers(inputText);
	    
		
		String stringDelimiter = "[,\n]";
		if (inputText.startsWith(DELIMITER_PREFIX)) {
			char delimiter = inputText.charAt(DELIMITER_PREFIX.length());
			inputText = inputText.substring(DELIMITER_PREFIX.length()
					+ DELIMITER_LENGTH + DELIMITER_SPLITTER.length());
			stringDelimiter = delimiter + "";
		}
		int[] numbersAsInts = convertTextToNumbers(inputText, stringDelimiter);
		return numbersAsInts;
	}
	
	private int[] convertTextToNumbers(String numbers, String stringDelimiter) {
		String[] split = numbers.split(stringDelimiter);
		int[] numberAsInts = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			numberAsInts[i] = Integer.parseInt(split[i]);
		}
		int[] numbersAsInts = numberAsInts;
		return numbersAsInts;
	}

}
