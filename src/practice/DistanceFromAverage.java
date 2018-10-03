package practice;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arrayNums = new double[20];
		int i = 0;
		double avg = 0;
		double total = 0;
		Scanner input = new Scanner(System.in);
		while (arrayNums[i] != 9999 && i < arrayNums.length) {
			System.out.println("Enter a number: ");
			arrayNums[i] = input.nextDouble();
			i++;
			total = total + arrayNums[i];
		}

		System.out.println("Total: " + total);
		avg = total / arrayNums.length;
		System.out.println("Average: " + avg);

	}

}
