package edu.wit.cs.comp1050;
import java.util.Scanner;

//TODO: document this class
public class PA1b {
	
	/**
	 * Error message to display for any non-negative counts 
	 */


	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		int quarters;
		int dimes;
		int nickels;
		int pennies;

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter number of quarters: ");
		quarters = input.nextInt();
		System.out.printf("Enter number of dimes: ");
		dimes = input.nextInt();
		System.out.printf("Enter number of nickels: ");
		nickels = input.nextInt();
		System.out.printf("Enter number of pennies: ");
		pennies = input.nextInt();


		double total = ((0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies));
		System.out.printf("You have $%.2f in coins.%n", total);
	}


}
