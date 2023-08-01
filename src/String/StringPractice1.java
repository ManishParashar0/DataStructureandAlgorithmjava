package String;

import java.util.Scanner;

//Find Duplicate Characters in String 
public class StringPractice1 {
	public static void way1(Scanner scan) {
		int count = 0;
		String next = scan.nextLine();
		System.out.println(next);
		for (int i = 0; i < next.length(); i++) {
			for (int j = i + 1; j < next.length(); j++) {
				char charAt = next.charAt(i);
				char charAt2 = next.charAt(j);
				if (charAt == charAt2) {
					System.out.println(charAt2 + " is duplicate");
					count++;
				}
			}
		}
		System.out.println(count + "total duplicate");
		// this is string work

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		way1(scan);
	}
}
