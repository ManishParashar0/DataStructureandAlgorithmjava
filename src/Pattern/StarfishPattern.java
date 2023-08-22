package Pattern;

public class StarfishPattern {
	public static void main(String[] args) {
		int size = 5; // Adjust the size of the starfish pattern

		drawStarfish(size);
	}

	public static void drawStarfish(int size) {
		int totalRows = size * 2 + 1;

		for (int row = 1; row <= totalRows; row++) {
			for (int col = 1; col <= totalRows; col++) {
				if (col == row || col == totalRows - row + 1) {
					System.out.print("*");
				} else if (row == size + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
