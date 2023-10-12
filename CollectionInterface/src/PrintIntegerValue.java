import java.util.Scanner;

public class PrintIntegerValue {

	public static void main(String[] args) {

		int num;

		System.out.println("Enter the Integer: ");

		Scanner s = new Scanner(System.in);

		num = s.nextInt();

		System.out.println("Entered Integer is: " + num);

	}

}
