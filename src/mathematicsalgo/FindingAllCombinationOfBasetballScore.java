package mathematicsalgo;

import java.util.Arrays;

public class FindingAllCombinationOfBasetballScore {

	private static final int MAX_POINTER = 3;
	private static final int MAX_ARRAYSIZE = 100;

	private static int arr[] = new int[MAX_ARRAYSIZE];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findCombinationsOfScore(2, 0);
		System.out.println(Arrays.toString(arr));

	}

	public static void findCombinationsOfScore(int theCurrentTotal, int indexInArray) {
		// int arr[] = new int[MAX_ARRAYSIZE];
		if(theCurrentTotal ==0 )
		{
			printArray(arr, indexInArray);
		}
		else if (theCurrentTotal > 0) {

		for (int i = 1; i <= MAX_POINTER; i++) {
			arr[indexInArray] = i;
				findCombinationsOfScore(theCurrentTotal - i, indexInArray + 1);
		}
		}
	}

	private static void printArray(int[] arr2, int indexInArray) {
		System.out.println(Arrays.toString(arr2));
		for (int i = 0; i < indexInArray; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

}
