package application;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final int NUMB_OF_COUNTRIES = 8;
		final int NUMB_OF_MEDAlS = 3;
		String[] countries = {"Deutschland", "Vereinigte Staaten", "Österreich",
				"Russland", "Kanada", "Schweden", "Südkorea", "Schweiz"};
		int[][] medals = {{11, 12, 6}, {9, 9, 7}, {9, 7, 7}, {8, 6, 8},
				{7, 10, 7}, {7, 2, 5}, {6, 3, 2}, {5, 4, 5}};
		table(countries, medals);
		System.out.println("The amount of silver medals per country are: " + Arrays.toString(getAllSilverMedals(medals)));
	}

	public static void table(String[] countries, int[][] medals) {

		for (int i = 0; i < medals.length; i++) {
			int sum = 0;
			System.out.print(countries[i] + ": ");
			for (int j = 0; j < medals[i].length; j++) {
				sum += medals[i][j];
				System.out.print(medals[i][j] + " ");
			}
			System.out.println(" --> Medals in total: " + sum);
			System.out.println();
		}
	}

	public static int[] getAllSilverMedals(int[][] medals){
		int[] silver = new int[medals.length];
		int silverCol = 1;
		for (int i = 0; i < medals.length; i++) {
			for (int j = 0; j < medals[i].length; j++) {
			silver[i] = medals[i][silverCol];
			}
		}
		return silver;
	}
}
