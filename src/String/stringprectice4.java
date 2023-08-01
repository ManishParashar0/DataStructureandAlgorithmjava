package String;

// Check if a String contains only digits?
public class stringprectice4 {
	public static boolean containsOnlyDigits(String inputString) {
		for (char c : inputString.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String inputStr = "12345";
		boolean result = containsOnlyDigits(inputStr);
		System.out.println(result); // Output: true

		inputStr = "123abc";
		result = containsOnlyDigits(inputStr);
		System.out.println(result); // Output: false
	}
}
