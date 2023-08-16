package Pattern;

public class IndianFlag {
	// main() method start
	public static void main(String[] args) {

		// declare and initialize variables
		int height = 26;
		int width = 40;
		int temp = 3;

		// we use only one nested loop to print all the parts of the flag
		for (int m = 1; m <= height; m++) {
			for (int n = 1; n <= width; n++) {

				// create first layer of Indian flag
				if (m <= 4) {
					if (m == 1 || m == 4) {
						if (n >= 15 && n <= 35) {
							System.out.print("-");
						} else {
							System.out.print(" ");
						}
					} else {
						if (m == 2 || m == 3) {
							if (n == 15 || n == 35) {
								System.out.print("|");
							} else {
								System.out.print(" ");
							}
						}
					}
				}
				if (m > 4 && m <= 8) {
					// second layer of the flag
					if (m <= 7) {
						if (n == 15 || n == 35) {
							System.out.print("|");
						} else {
							if (n >= 22 && n <= 28) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						}
					} else {
						if (n >= 15 && n <= 35) {
							System.out.print("-");
						} else {
							System.out.print(" ");
						}
					}
				}
				if (m > 8 && m <= 11) {
					// third layer of the flag
					if (m <= 10) {
						if (n == 15 || n == 35) {
							System.out.print("|");
						} else {
							System.out.print(" ");
						}
					} else {
						if (n >= 15 && n <= 35) {
							System.out.print("-");
						} else {
							System.out.print(" ");
						}
					}
				}
				if (m >= 12 && m <= 19) {
					// stick of the flag
					if (n == 15) {
						System.out.print("|");
					} else {
						System.out.print(" ");
					}
				}
				// stairs of the flag
				if (m >= 20) {
					if (m % 2 == 0) {
						if (n >= 15 - temp && n <= 15 + temp) {
							System.out.print("-");
						} else {
							System.out.print(" ");
						}
					} else {
						if (n == 15 - temp || n == 15 + temp) {
							System.out.print("|");
						} else {
							System.out.print(" ");
						}
					}
				}
			}
			if (m >= 20) {
				if (m % 2 != 0) {
					temp++;
				}
			}
			System.out.print("\n");
		}
	}
}