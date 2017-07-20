package dp.LIS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibnocciDp {

	private Map<Integer, Integer> hashMap;

	public FibnocciDp() {
		hashMap = new HashMap<>();
		hashMap.put(0, 0);
		hashMap.put(1, 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the fibnocci number: ");
			Integer val = scan.nextInt();
			FibnocciDp fdp = new FibnocciDp();
			Integer i = fdp.fibnocci(val);
			System.out.println(i);
		}

	}

	public Integer fibnocci(Integer n) {
		if (hashMap.containsKey(n))
			return hashMap.get(n);

		Integer sum = fibnocci(n - 1) + fibnocci(n - 2);
		hashMap.put(n, sum);
		return sum;
	}


}
