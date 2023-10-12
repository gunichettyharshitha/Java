import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	static void charactersInString(String inputString) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println("CharOccurence count in a string");

		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("Dupilcated characters in a string");
		Set<Character> keys = hm.keySet();
		for (Character ch : keys) {
			if (hm.get(ch) > 1) {
				System.out.println(ch + "  is " + hm.get(ch) + " times");
			}
		}
	}

	public static void main(String[] args) {
		String input = "Developer";
		charactersInString(input.toLowerCase());
	}
}
