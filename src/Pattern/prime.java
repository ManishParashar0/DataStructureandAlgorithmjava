package Pattern;

public class prime {
	public static boolean prime(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(prime(4));
	}
}
/*
 * public class Prime { public static boolean isPrime(int num) { if (num <= 1) {
 * return false; }
 * 
 * for (int i = 2; i <= Math.sqrt(num); i++) { if (num % i == 0) { return false;
 * } }
 * 
 * return true; }
 * 
 * public static void main(String[] args) { for (int i = 0; i <= 50; i++) { if
 * (isPrime(i)) { System.out.println(i + " is prime"); } else {
 * System.out.println(i + " is not prime"); } } } }
 */
