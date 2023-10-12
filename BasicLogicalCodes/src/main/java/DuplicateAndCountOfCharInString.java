import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateAndCountOfCharInString {

	public static void main(String[] args) {
		String input = "Kuberenetes";
		inputStirng(input);

	}

	static void inputStirng(String inputString) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

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

		Set<Character> keys = hashMap.keySet();
		for (Character ch : keys) {
			if (hashMap.get(ch) > 1) {
				System.out.println(ch + " is " + hashMap.get(ch) + " times ");
			}
		}

	}

}
