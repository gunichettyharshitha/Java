
public class SwapValues1 {

	static void swapValuesusingThirdVaraible(int m, int n) {
		System.out.println("Before Swap" + " Value of m is " + m + " and the Value of n is " + n);
		int temp = m; // temp is 5
		m = n; // m is 8
		n = temp; // n is 5
		System.out.println("After Swap" + " Value of m is " + m + " and the Value of n is " + n);

	}

	public static void main(String[] args) {
		
		swapValuesusingThirdVaraible(5, 8);

	}

}
