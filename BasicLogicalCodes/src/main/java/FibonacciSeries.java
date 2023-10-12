
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int number1 = 0, number2 = 1, number3, i, count = 6;
		
		System.out.println(number1 + " " + number2);
		
		for(i=2;i<count;++i) {
			number3 = number1 + number2;
			System.out.println(" " + number3);
			number1 = number2;
			number2 = number3;
		}

	}

}
