package patternmatching;

import java.util.HashMap;

public class FindingAnagramEfficent {
	private static String pattern = "ABCD";
	private static String input = "BACDGABCDA";
	private static HashMap<Character, Integer> inputHM;
	private static HashMap<Character, Integer> patternHM = new HashMap<>();

	public static void main(String[] args) {
		// This algorithm is in accordance with Rabin Karp
		// We create a hash of pattern with frequency
		int patternSize = pattern.length();
		int inputSize = input.length();
		// Doing hashing on pattern based on frequency of characters.
		populateHashMap(pattern, patternHM);
		/* The chToRemove is used to keep a track of first character picked in a
		window which we remove. This is kept to avoid whole hashing of the input
		string of pattern size */
		Character chToRemove = null;
		// Here we parse input string, creating substring which needs to be
		// hashed.
		for (int i = 0; i < inputSize - patternSize + 1; i++) {
			String subStringToProcess = input.substring(i, i + patternSize);
			createOrPopulateInputTextHashString(subStringToProcess, chToRemove);
			chToRemove = input.charAt(i);
			boolean result = reportAnagramMatch(inputHM);
			if (result)
				System.out.println(subStringToProcess + " is an anagram match " + ", for pattern " + pattern
						+ " ,occured at index " + i);
		}

	}

	/**
	 * This method is one which generates hash map from the input String. At
	 * first we simply hash it. But in next calls we just need to remove the
	 * first character hashed And add the new character. Rest is already hashed.
	 * It though complicates But obvious improvement.
	 * 
	 * @param subStringToProcess
	 * @param keyToRemove
	 * @return
	 */
	private static HashMap<Character, Integer> createOrPopulateInputTextHashString(String subStringToProcess,
			Character keyToRemove) {
		if (inputHM == null) {
			inputHM = new HashMap<>();
			populateHashMap(subStringToProcess, inputHM);
		} else {
			if (inputHM.containsKey(keyToRemove)) {
				inputHM.remove(keyToRemove);
			}
			// pick the last character
			String str = subStringToProcess.substring(subStringToProcess.length() - 1);
			populateHashMap(str, inputHM);
		}
		return inputHM;

	}

	/**
	 * General method to populate hash map , based on frequency of characters
	 * 
	 * @param str
	 * @param hm
	 */
	private static void populateHashMap(String str, HashMap<Character, Integer> hm) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), count);

			} else {
				count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), count++);
			}
		}
	}

	/**
	 * Here we simply match both hash maps
	 * 
	 * @param inputHM
	 * @return
	 */
	private static boolean reportAnagramMatch(HashMap<Character, Integer> inputHM) {
		boolean result = false;
		for (Character k : patternHM.keySet()) {
			if (inputHM.containsKey(k) && patternHM.get(k).equals(inputHM.get(k))) {
				result = true;
			} else {
				return false;
			}
		}
		return result;
	}

}

