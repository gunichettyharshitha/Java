public class IfElse {

	public static void main(String[] args) {

		int x = 298;

		if (x > 20 && x <= 300) {
			System.out.println("Hello");
			System.out.println("Start");
		} else
			System.out.println("Bye");

		// ============ find the greatest value
		int a = 17;
		int b = 46;
		int c = 8;

		if (a > b && a > c)
			System.out.println("The Greatest is a : " + a);
		else if (b > c)
			System.out.println("The Greatest is b : " + b);
		else
			System.out.println("The Greatest is c : " + c);
		
		int greatest = (a > b && a > c) ? a : (b>c) ? b : c;
		System.out.println("Using Ternary Operator " + " : " + "The Greatest is " + ((greatest == a) ? "a : " + a : (greatest == b) ? "b : " + b : "c : " + c));

		// Ternary operator => Structure (ifcondition)?True:False
		// Check the even or odd if even print 10 and odd print 20

		int s = 2410;
		int result = 0;

		/*
		 * if(s%2==0) result = 10; else result = 20;
		 * 
		 * System.out.println(result);
		 */
		result = (s % 2 == 0) ? 10 : 20;
		System.out.println(result);

	}
}
