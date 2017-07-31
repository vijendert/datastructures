package mathematicsalgo;

public class PowerWithoutAnyUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(5, 3));
	}

	private static int pow(int num, int power) {
		if (power == 0)
			return 1;
		int answer = num;
		int increment = num;
		int i, j;
		for (i = 1; i < power; i++) {
			for (j = 1; j < num; j++) {
				answer += increment;
			}
			increment = answer;
		}
		return answer;
	}

}
