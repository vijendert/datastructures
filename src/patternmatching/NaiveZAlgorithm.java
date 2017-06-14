package patternmatching;

import java.util.Arrays;

public class NaiveZAlgorithm {

	public static void main(String[] args) {
		String input = "xabcabzabc";
		String pattern = "abc";
		// Join both string using $ sign
		String toZ = String.join("$", pattern, input);
		System.out.println(toZ);
		int[] Z = new int[toZ.length()];
		Z[0] = 0;
		// Here we start the matching of course the for loop
		for (int i = 1; i < toZ.length(); i++) {
			Z[i] = countForMatchSequence(i, toZ);
		}
		System.out.println(Arrays.toString(Z));
		parseZToGetMatchingString(Z, pattern.length());
	}

	private static void parseZToGetMatchingString(int[] z, int patternLength) {
		for (int i = 0; i < z.length; i++) {
			if (z[i] == patternLength) {
				System.out.println("Found match at index " + (i - patternLength - 1));
			}
		}

	}

	private static int countForMatchSequence(int i, String toZ) {
		int count = 0;
		while (i < toZ.length() && toZ.charAt(count) == toZ.charAt(i)) {
			count++;
			i++;
		}
		return count;
	}

}
