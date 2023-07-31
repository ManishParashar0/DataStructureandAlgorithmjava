package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	public static char findFirstNonRepeatedCharacter(String str) {
		// Create a LinkedHashMap to store character frequencies while preserving order
		Map<Character, Integer> charFrequencyMap = new LinkedHashMap<>();

		// Calculate character frequencies
		for (char ch : str.toCharArray()) {
			charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
		}

		// Find the first non-repeated character
		for (char ch : charFrequencyMap.keySet()) {
			if (charFrequencyMap.get(ch) == 1) {
				return ch;
			}
		}

		// If no non-repeated character is found, return a default value, such as '\0'
		return '\0';
	}

	public static void main(String[] args) {
		String inputString = "aabbccdeeff";

		char firstNonRepeated = findFirstNonRepeatedCharacter(inputString);
		if (firstNonRepeated != '\0') {
			System.out.println("The first non-repeated character is: " + firstNonRepeated);
		} else {
			System.out.println("No non-repeated character found.");
		}
	}
}
