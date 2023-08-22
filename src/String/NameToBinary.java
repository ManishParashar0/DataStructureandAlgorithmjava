package String;

import java.util.Scanner;

public class NameToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = scanner.nextLine();
		scanner.close();

		String binaryName = nameToBinary(name);
		System.out.println("Binary code for '" + name + "': " + binaryName);
	}

	public static String nameToBinary(String name) {
		StringBuilder binaryCode = new StringBuilder();
		for (char ch : name.toCharArray()) {
			binaryCode.append(String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0'));
		}
		return binaryCode.toString();
	}
}
