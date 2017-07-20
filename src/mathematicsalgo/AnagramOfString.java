package mathematicsalgo;

public class AnagramOfString {
	public static void main(String[] args) {
		String input = "cats";
		permute(input, 0, input.length() - 1);

	}

	private static void permute(String input, int f, int l) {
		// TODO Auto-generated method stub
		if (f == l) {
			System.out.println(input);
		}
		else {

			for (int i = f; i <= l; i++) {
				input = swap(input, f, i);
				permute(input, f + 1, l);
				input = swap(input, f, i);
			}
		}
	}

	private static String swap(String input, int f, int i) {
		char[] cha = input.toCharArray();
		char temp = cha[f];
		cha[f] = cha[i];
		cha[i] = temp;
		String result = String.valueOf(cha);

		return result;
	}
}
