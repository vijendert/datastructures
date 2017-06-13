package dp.LIS;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 113;
		int sum = 0;
		while (input != 0) {

			sum += input % 10;
			input = input / 10;
		}
		System.out.println("sum is " + sum);

	}

}
