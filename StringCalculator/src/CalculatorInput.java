public class CalculatorInput {

//	private static final char DEFAULT_DELIMITER = ',';
	private static final String DELIMITER_PREFIX = "//";
	private static final int DELIMITER_LENGTH = 1;
	private static final String DELIMITER_SPLITTER = "\n";
	
	
//	private char delimiter = ','; 
	
	private int[] parsedNumbers = null;
	
	public CalculatorInput(String textToParse) {
		parsedNumbers = parseNumbers(textToParse);
	}
	
	public int[] getCalculatorArguments() {
		return this.parsedNumbers;
	}
	
	private int[] parseNumbers(String inputText) {
		// apply single level of abstraction:
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
