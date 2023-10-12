package strings;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java"); // Appends "Java" to the original string
		System.out.println(sb); // Prints "Hello Java"
		
		sb.insert(6, "Devops ");
		System.out.println(sb);
		
		sb.replace(9,10, "secops");
		System.out.println(sb);
		
		sb.delete(15, 16);
		System.out.println(sb);
		
		sb.delete(15, 16);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
	
	
}
