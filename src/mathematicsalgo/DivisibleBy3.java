package mathematicsalgo;

public class DivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 23;
		int groupSize = 4;
		/*int num = 23;
		int result = num & 1;
		System.out.println(result);*/
		// System.out.println(Integer.toBinaryString(1));
		StringBuilder result = new StringBuilder();

		for (int i = 31; i >= 0; i--) {
			int mask = 1 << i;
			System.out.println(Integer.toBinaryString(mask));
			System.out.println(Integer.toBinaryString(number));
			result.append((number & mask) != 0 ? "1" : "0");

			if (i % groupSize == 0)
				result.append(" ");
			System.out.println("result = " + result);
		}
		result.replace(result.length() - 1, result.length(), "");
		// System.out.println(result.toString());
		int i = 3;
		int j = 4;
		int k = i & j;
		// System.out.println(k);

		int l = 31;
		int sumResult = 1 << l;
		// System.out.println(Integer.toBinaryString(sumResult));
		// System.out.println(Integer.toBinaryString(23));



	}

}
