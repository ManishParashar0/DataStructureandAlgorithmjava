package String;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFinder {

	public static void findDuplicateCharacters(String input) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Iterate through each character in the input string
		for (char c : input.toCharArray()) {
			// Ignore spaces and non-alphabetic characters (modify the condition as needed)
			if (Character.isAlphabetic(c)) {
				// Convert to lowercase to make the search case-insensitive
				char lowercaseChar = Character.toLowerCase(c);

				// Increment the character count in the map
				charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0) + 1);
			}
		}

		// Display the duplicate characters
		System.out.println("Duplicate characters in the string:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue() + " occurrences");
			}
		}
	}

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		findDuplicateCharacters(inputString);
	}
}
