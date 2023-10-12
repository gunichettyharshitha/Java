public class ArmstrongNumber {
	public static void main(String[] args) {

		// whose sum of cubes of its digit is equal to that number.
		// ex : 153 = (1)^3 + (5)^3 + (3)^3

		int sumOfCube = 0, a, temp;
		int number = 153;
		temp = number;

		while (number > 0) {
			a = number % 10;
			number = number / 10;
			sumOfCube = sumOfCube + (a * a * a);

		}

		if (temp == sumOfCube)
			System.out.println(temp + " is an armstrong");
		else
			System.out.println(temp + " is not an armstrong");

	}

}
