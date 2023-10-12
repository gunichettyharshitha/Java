import java.util.HashMap;
import java.util.Map;

public class Demo {

	static void countCharinString(String input) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		char[] strArray = input.toCharArray();

		for (char c : strArray) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}

		for (Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		String str = "hhYyUiyY";
		countCharinString(str.toLowerCase());
	}
}
