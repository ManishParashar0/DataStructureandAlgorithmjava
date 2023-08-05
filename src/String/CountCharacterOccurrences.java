package String;

import java.util.Scanner;

public class CountCharacterOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String inputString = scanner.nextLine();

		System.out.println("Enter the character to count:");
		char charToCount = scanner.nextLine().charAt(0);

		int occurrenceCount = countCharacterOccurrences(inputString, charToCount);

		System.out.println("Number of occurrences of '" + charToCount + "': " + occurrenceCount);

		scanner.close();
	}

	// Helper method to count the occurrences of a given character in a string
	private static int countCharacterOccurrences(String inputString, char charToCount) {
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == charToCount) {
				count++;
			}
		}
		return count;
	}
}
