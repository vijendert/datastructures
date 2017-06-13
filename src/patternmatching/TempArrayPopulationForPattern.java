package patternmatching;

import java.util.Arrays;

public class TempArrayPopulationForPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String pattern = "aabaabaaa";
		String pattern = "abcaby";
		String input = "abxabcabcaby";
		int[] temp = new int[pattern.length()];
		int i = 1;
		int j = 0;
		// Above two variables are initalzed in such a way we compare forst two
		// elements
		temp[0] = 0;
		// We run till we cover all elemnts in pattern
		while (i < temp.length) {
			// if equal we increent both i and j meaning pick next two elements
			if ((pattern.charAt(i)) == ((pattern.charAt(j)))) {
				// if we have equal we then the temp array value at i is index j
				// +1
				temp[i] = j + 1;
				i++;
				j++;
			} else {
				// If not equal two cases arise
				// 1 st we have j =0 if so meaning we are comparing first
				// element with second no match
				// so here we sipmply increase i and put temp[i] = 0
				if (j == 0) {
					temp[i] = 0;
					i++;
				} else {
					// interesting thing happens here
					// We go one less item at j and find its value set it as j
					j = temp[j - 1];
				}

			}
		}
		System.out.println(Arrays.toString(temp));
		int k = 0;
		int l = 0;
		// Run till whole lenght of input string is covered
		while (k < input.length()) {
			// if match of pattern and the inpot character
			if (input.charAt(k) == pattern.charAt(l)) {
				l++;
				k++;
				if (l == pattern.length())
					System.out.println("We have a match");
			} else {
				// Now comes the intersting part
				// Here the catch is if the chaacter does match at l = 0 we
				// simply keep increasing k
				// meaning we are start and continous matching so we keep
				// increasing k
				// if that is not the case we go one less in pattern array and
				// its value is from where we start the
				// match
				if (l != 0)
					l = temp[l - 1];
				else
					k++;
			}
		}

	}
	// After having the temp array ready we begin the matching game

}
