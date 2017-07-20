package mathematicsalgo;

public class PrintAllPrimeFactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 85;
		while (input % 2 == 0) {
			System.out.print("2 ");
			input /= 2;
		}
		for (int i = 3; i <= Math.sqrt(input); i = i + 2)
		{
			while (input % i == 0) {
				System.out.print(i + " ");
				input /= i;
			}
		}
		// If it is a prime number greater than 2
		// it will never enter the odd number loop
		// So need to print it
		if (input > 2)
			System.out.println(input + " ");
	}
}
