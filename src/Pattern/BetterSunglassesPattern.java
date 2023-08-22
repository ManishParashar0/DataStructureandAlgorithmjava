package Pattern;
public class BetterSunglassesPattern {
	public static void main(String[] args) {
		int height = 7; // Adjust the height of the sunglasses pattern

		drawSunglasses(height);
	}

	public static void drawSunglasses(int height) {
		int width = height * 6;
		int lensWidth = width / 2 - 1;

		for (int row = 1; row <= height; row++) {
			for (int col = 1; col <= width; col++) {
				if (col <= row || col > width - row + 1) {
					System.out.print("/");
				} else if (col >= width / 2 + 1 && col <= width / 2 + lensWidth) {
					System.out.print("=");
				} else if (col == width / 2 + lensWidth + 1 || col == width / 2 + lensWidth + 2) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
