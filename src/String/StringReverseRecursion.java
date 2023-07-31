package String;

public class StringReverseRecursion {
	public static String reverseString(String str) {
		// Base case: If the string is empty or has only one character, return the
		// string itself.
		if (str == null || str.length() <= 1) {
			return str;
		}

		// Recursive case: Reverse the substring from the 2nd character onwards and
		// append the first character at the end.
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		String reversedString = reverseString(inputString);
		System.out.println("Original String: " + inputString);
		System.out.println("Reversed String: " + reversedString);
	}
}
