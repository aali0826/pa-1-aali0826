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
		System.out.println("Enter the number of quarters: Enter number of dimes: Enter number of nickels: Enter number of pennies: All counts must be non-negative! ");
		quarters = input.nextInt();
		dimes = input.nextInt();
		nickels = input.nextInt();
		pennies = input.nextInt();


		double total = ((0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies));
		System.out.printf("Your total is $", total);
		System.out.printf("%.2f", total);
	}


}
