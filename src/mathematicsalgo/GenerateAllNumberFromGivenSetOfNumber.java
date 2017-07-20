package mathematicsalgo;

public class GenerateAllNumberFromGivenSetOfNumber {

	private static int maxDivisibleBy3 = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] input = { 1, 8, 7, 6, 0 };
		int[] input = { 1, 8, 7 };
		// convert it into string
		for (int outer = 0; outer < input.length; outer++)
		{
			String inputStr = "";
			for (int i = outer; i < input.length; i++) {
				inputStr += input[i];
			}
			System.out.println("inputStr = " + inputStr);
			findGreatestDivisibleby3(inputStr);
		}

		System.out.println("Brute force max divisible by 3 is = " + maxDivisibleBy3);
	}

	public static void findGreatestDivisibleby3(String inputStr) {
		findAllPermutationOfString(inputStr);
	}

	private static void findAllPermutationOfString(String inputStr) {
		permute(inputStr, 0, inputStr.length() - 1);
	}

	private static void checkAndMarkHighestDivisibleBy3(Integer num) {
		System.out.println("num =" + num);
		if (num % 3 == 0) {
//Number Divisible by 3
			if (num > maxDivisibleBy3) {
				maxDivisibleBy3 = num;
			}
		}

	}

	private static void permute(String inputStr, int l, int r) {
		if(l == r)
		{
			checkAndMarkHighestDivisibleBy3(Integer.valueOf(inputStr));
		}
		else
		{
			for (int i = l; i <= r; i++) {
				inputStr = swap(inputStr, l, i);
				permute(inputStr, l + 1, r);
				inputStr = swap(inputStr, l, i);
			}
		}
	}

	private static String swap(String inputStr, int l, int i) {
		char[] characterArray = inputStr.toCharArray();
		char temp = characterArray[l];
		characterArray[l] = characterArray[i];
		characterArray[i] = temp;
		inputStr = String.valueOf(characterArray);
		return inputStr;
	}

}
