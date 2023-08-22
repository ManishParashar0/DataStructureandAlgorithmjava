package Pattern;

public class HomePattern {
	public static void main(String[] args) {
		int height = 6; // Adjust the height of the home pattern

		drawHome(height);
	}

	public static void drawHome(int height) {
		int width = height * 2;

		// Draw roof
		for (int row = 1; row <= height; row++) {
			for (int col = 1; col <= width; col++) {
				if (col > height - row && col < height + row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Draw walls and door
		for (int row = 1; row <= height / 2; row++) {
			for (int col = 1; col <= width; col++) {
				if ((col == 1 || col == width) || (col >= height / 2 && col <= width - height / 2)) {
					System.out.print("|");
				} else if (col == width / 2) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
