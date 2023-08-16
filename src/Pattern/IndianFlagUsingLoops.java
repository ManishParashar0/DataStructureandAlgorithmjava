package Pattern;

public class IndianFlagUsingLoops {

	public static void main(String[] args) {
		int height = 15; // Adjust the height as needed
		int width = 20; // Adjust the width as needed

		// Saffron Stripe
		for (int i = 0; i < height / 3; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// White Stripe
		for (int i = 0; i < height / 3; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		// Green Stripe
		for (int i = 0; i < height / 3; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Ashoka Chakra
		int centerX = width / 2;
		int centerY = height / 2;
		int chakraRadius = height / 6;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((Math.pow(j - centerX, 2) + Math.pow(i - centerY, 2)) <= Math.pow(chakraRadius, 2)) {
					System.out.print("B"); // Blue color for Ashoka Chakra
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
