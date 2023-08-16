package Pattern;

class ArmstrongNumber {
	public static void main(String[] args) {
		int sumOfCube = 0, a, temp;
		int number = 153;
		temp = number;
		while (number > 0) {
			a = number % 10; // Getting last digit
			number = number / 10; // Removing last digit from number
			sumOfCube = sumOfCube + (a * a * a); // Calculating sum of cubes of digits
		}
		if (temp == sumOfCube)
			System.out.println(temp + " is an armstrong number");
		else
			System.out.println(temp + "is not an armstrong number");
	}
}