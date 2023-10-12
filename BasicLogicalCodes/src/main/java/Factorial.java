
public class Factorial {

	public static void main(String[] args) {
		int i, factorial = 1;
		int n = 8;
		for(i=1;i<=n;i++) {
			factorial = factorial*i;
		}
		
		System.out.println(factorial + " is the factorial of: " + n);

	}

}
