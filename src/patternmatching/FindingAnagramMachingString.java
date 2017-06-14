package patternmatching;

import java.util.HashMap;

public class FindingAnagramMachingString {
	private static String pattern = "ABCD";
	private static String input = "BACDGABCDA";

	public static void main(String[] args) {
		// This algorithm is din accordance with Rabin Karp
		// We create a hash of pattern with frequency

		// Doing hashing based on frequency of pattern.
		int patternSize = pattern.length();
		int inputSize = input.length();
		HashMap<Character, Integer> patternHM = createPatternashString(pattern);
		System.out.println("Pattern hash " + patternHM.toString());
		// All pattern hash done
		// If I need to have an anagram, the selected string should match the
		// whole
		// current selected part of the input string
		for (int i = 0; i < inputSize - patternSize + 1; i++) {
			String subStringToProcess = input.substring(i, i + patternSize);
			System.out.println("subStringToProcess " + subStringToProcess);
			HashMap<Character, Integer> inputHM = createPatternashString(subStringToProcess);
			System.out.println("inputHM " + inputHM);
			boolean result = reportAnagramMatch(i, inputHM, patternHM);
			if (result)
				System.out.println("An anagram match " + inputHM + " occured at index " + i);
			else
				System.out.println("No match at all");
		}

	}

	private static boolean reportAnagramMatch(int i, HashMap<Character, Integer> inputHM,
			HashMap<Character, Integer> patternHM) {
		boolean result = false;
		System.out.println(inputHM.toString() + "     " + patternHM.toString());
		for (Character k : patternHM.keySet()) {
			if (inputHM.containsKey(k) && patternHM.get(k).equals(inputHM.get(k))) {
				result = true;
			} else {
				return false;
			}
		}
		return result;

	}

	private static HashMap<Character, Integer> createPatternashString(String strToHash) {

		HashMap<Character, Integer> hm = new HashMap<>();
		int count = 1;
		for (int i = 0; i < strToHash.length(); i++) {
			if (!hm.containsKey(strToHash.charAt(i))) {
				hm.put(strToHash.charAt(i), count);

			} else {
				count = hm.get(strToHash.charAt(i));
				hm.put(strToHash.charAt(i), count++);
			}
		}
		return hm;
	}

}
