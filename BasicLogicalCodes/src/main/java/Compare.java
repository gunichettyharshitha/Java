
public class Compare {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = null;

		/*
		 * try { int result = str1.compareTo(str2); System.out.println(result); } catch
		 * (NullPointerException e) { System.out.println("Caught NullPointerException: "
		 * + e.getMessage()); //e.printStackTrace(); }
		 */
		try {
		    int result;
		    
		    if (str1 == null && str2 == null) {
		        result = 0; // Both strings are null, consider them equal
		    } else if (str1 == null) {
		        result = -1; // str1 is null, consider it less than str2
		    } else if (str2 == null) {
		        result = 1; // str2 is null, consider it greater than str1
		    } else {
		        result = str1.compareTo(str2); // Compare the non-null strings
		    }

		    if (result == 0) {
		        System.out.println("Strings are equal");
		    } else if (result < 0) {
		        System.out.println("str1 is less than str2");
		    } else {
		        System.out.println("str1 is greater than str2");
		    }
		} catch (NullPointerException e) {
		    System.out.println("Caught NullPointerException: " + e.getMessage());
		}


	}
}
