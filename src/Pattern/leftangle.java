package Pattern;

public class leftangle {
	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j <= i; j++) {
		 * 
		 * System.out.print(" *"); } System.out.println(""); }
		 */

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a == 5 || b == 1 || b == a) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
