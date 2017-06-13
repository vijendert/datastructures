package gp.numberofplatforms;

import java.util.Arrays;

public class NumberOfPlatfroms {

	static class DepartureArrivalOfBus implements Comparable<DepartureArrivalOfBus> {
		public int arrival;
		public int departure;

		DepartureArrivalOfBus(int arrival, int departure) {
			this.arrival = arrival;
			this.departure = departure;
		}

		@Override
		public int compareTo(DepartureArrivalOfBus o) {
			return this.departure - o.departure;
		}

		@Override
		public String toString() {
			return "arrival := " + this.arrival + ", dep := " + this.departure;
		}
	}

	public static void main(String[] args) {
		/*int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };*/
		int[] arrival = { 1100, 1102 };
		int[] dep = { 1101, 1103 };

		DepartureArrivalOfBus[] daofBusLst = new DepartureArrivalOfBus[arrival.length];
		for (int i = 0; i < arrival.length; i++) {
			daofBusLst[i] = new DepartureArrivalOfBus(arrival[i], dep[i]);
		}
		Arrays.sort(daofBusLst);
		System.out.println(Arrays.toString(daofBusLst));
		int countNumberOfPlatforms = 1;
		int i = 0;
		for (int j = 1; j < daofBusLst.length; j++) {
			if (dep[i] < arrival[j]) {
				countNumberOfPlatforms++;
			} else {

			}
			i = j;
		}
		System.out.println("number of platforms required " + countNumberOfPlatforms);
	}

}
