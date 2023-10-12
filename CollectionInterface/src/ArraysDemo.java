
public class ArraysDemo {

	public static void main(String[] args) {
		int nums[] = { 5, 6, 7, 8 };
		System.out.println(nums[1]);
		// or
		int numbers[] = new int[4];
		numbers[0] = 5;
		numbers[1] = 6;
		numbers[2] = 7;
		numbers[3] = 8;

		// to fetch all the values
		for (int i = 0; i < 4; i++) {
			System.out.println(i + ": " + numbers[i]);
		}
		System.out.println("=================================");
		// multideimensional arrays
		int mDA[][] = new int[3][4];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print(mDA[i][j] + " ");
			}

			System.out.println();
		}
		// ================================================================
		// to generate random function
		int sampleArray[][] = new int[3][4];
		System.out.println("Using random function(random values) values of the variables in an array");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				sampleArray[i][j] = (int) (Math.random() * 100); // random function gives double or float values so
																	// casting to int

				System.out.print(sampleArray[i][j] + " ");
			}
			System.out.println();
		}
		// ================================================================
		// jagged array : in the abouve multi dimensional thr array size of every row is
		// fixed but we can change the array size as required
		int jaggedArray[][] = new int[3][];
		System.out.println("JaggedArray");
		jaggedArray[0] = new int[4];
		jaggedArray[1] = new int[2];
		jaggedArray[2] = new int[6];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				jaggedArray[i][j] = (int) (Math.random() * 100);

			}
		}
		// to print the values using enhanced for loop
		for (int n[] : jaggedArray) {
			for (int m : n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}

}
// Advantages
// 1. Arrays are fast
// 2. Store multiple values
// 3. Everytime you know you have a fixed size and if you want to store multiple values... Arrays are the 1st preference

// drwabacks of array:
// 1. Once the array size is specified then it is not expandable. the size if fixed
// 2. Everytime if you want search/insert something it will traverse between the elements it does consume a lot of time
// 3. Type should be same