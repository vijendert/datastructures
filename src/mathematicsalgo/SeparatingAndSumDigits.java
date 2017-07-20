package mathematicsalgo;

public class SeparatingAndSumDigits {

	public static void main(String[] args) {
		int input = 245;
		// Seperate each digit telling which it belongs
		int operate = input;
		int position = 0;
		while (operate > 0) {
			int digit = operate % 10;
			operate = operate / 10;
			position++;
			System.out.println("Digit at position(right to left) " + position + " , is " + digit);
		}

	}

}
