package String;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	public static void main(String[] args) {
		String inputString = "abc";
		List<String> permutations = findPermutations(inputString);
		System.out.println(permutations);
	}

	public static List<String> findPermutations(String str) {
		List<String> result = new ArrayList<>();
		findPermutationsHelper("", str, result);
		return result;
	}

	private static void findPermutationsHelper(String prefix, String suffix, List<String> result) {
		int n = suffix.length();
		if (n == 0) {
			result.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				char ch = suffix.charAt(i);
				String newPrefix = prefix + ch;
				String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
				findPermutationsHelper(newPrefix, newSuffix, result);
			}
		}
	}
}
