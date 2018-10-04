package practice;

import java.util.Scanner;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNums = new int[10];
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 integers");
		
		for(int i = 0; i < arrayNums.length; i++) {
			System.out.print(">> ");
			arrayNums[i] = input.nextInt();
			total = total + arrayNums[i];
		}
		displayInt(arrayNums, total);
		displayIntBack(arrayNums, total);
		displayTotal(arrayNums, total);
		displayBelowAvg(arrayNums, total);

	}
	
	public static void displayTotal(int arrayNums[], int total) {
		System.out.println("Total: " + total);
	}
	
	public static void displayReverse(int arrayNums[], int total) {
		for(int j = 11; j >= 0; j--) {
			System.out.println("Numbers in reverse order " + arrayNums[j]);
	}
	}
	
	public static void displayIntBack(int arrayNums[], int total) {
		System.out.println("Integers backwards: ");
		for(int j = 9; j >= 0; j--) {
			System.out.println(arrayNums[j]);
	}
	}
	public static void displayInt(int arrayNums[], int total) {
		System.out.println("Integers forwards: ");
		for(int i = 0; i < arrayNums.length; i++) {
			System.out.println(arrayNums[i]);
		}
	}
	public static void displayBelowAvg(int arrayNums[], int total) {
		int avg;
		avg = total / arrayNums.length;
		System.out.println("Average: " + avg);
		System.out.println("Integers below average: ");
		for(int i = 0; i < arrayNums.length; i++) {
			if(arrayNums[i] <= avg) { 
			System.out.println(arrayNums[i]);
			}
	}
	}
}
