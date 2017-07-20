package mathematicsalgo;

public class LuckyNumber {
	public static void main(String[] args) {
		int input = 9;
		// If it is even we struck O(1)
		if (input % 2 == 0) {
			System.out.println("Not a lucky number");
		} else {
			// Here we pick the number
			// Keep subtracting the sequence from it 2,3,4 consecutively.
			// The idea here is think like this we have a sequence
			// 1,2,3,4,5,6,7,8
			// Input is 5 , rather than removing things lets mark them
			// when 2 it will 2,4,6,8
			// when 3 it will be 5,9
			// We can notice here 2+3 = 5, So we are technically removing 5 th
			// item from the
			// series when we have to remove 3 items after removal of the 2
			// items
			int count = 2;
			int res = input;
			while (res > 0) {
				res = res - (count++);
			}
			if (res == 0)
				System.out.println("Not a Lucky number");
			else
				System.out.println("Lucky number");
		}
	}
}
