package String;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String inputString = scanner.nextLine().toLowerCase(); // Convert the input string to lowercase for
																// case-insensitive counting

		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (Character.isLetter(ch)) { // Check if the character is a letter
				if (isVowel(ch)) {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);

		scanner.close();
	}

	// Helper method to check if a character is a vowel
	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
