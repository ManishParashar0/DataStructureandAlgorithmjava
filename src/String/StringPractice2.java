package String;

import java.util.Arrays;

public class StringPractice2 {
	public static boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase
		String s1 = str1.replaceAll("\\s", "").toLowerCase();
		String s2 = str2.replaceAll("\\s", "").toLowerCase();

		// Convert to character arrays
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		// Sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compare the sorted arrays
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (areAnagrams(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}
