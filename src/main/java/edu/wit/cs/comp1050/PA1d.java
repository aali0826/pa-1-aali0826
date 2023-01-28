package edu.wit.cs.comp1050;

import java.util.Scanner;

//TODO: document this class
public class PA1d {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "The package cannot be shipped!";
	
	/**
	 * Method to compute shipping cost
	 * 
	 * @param weight, assumed to be in (0, 20]
	 * @return cost to ship
	 */
	public static double shippingCost(double weight) {
		return 0.0; // TODO: replace with your method implementation
	}

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter package weight: The package cannot be shipped!%n");
		double weight = input.nextDouble();


		if ((weight > 0)&&(weight <= 1)) {
			System.out.printf("It will cost $3.50 to ship this package.");
		}
		else if ((weight > 1)&&(weight <= 3)) {
			System.out.printf("It will cost $5.50 to ship this package.");
		}

		else if ((weight > 3)&&(weight <= 10)) {
			System.out.printf("It will cost $8.50 to ship this package.");
		}
		else if ((weight > 10)&&(weight <= 20)) {
			System.out.printf("It will cost $10.50 to ship this package.");
		}
		System.out.println("Shipping cost of package is $"+ weight);
	}

}
