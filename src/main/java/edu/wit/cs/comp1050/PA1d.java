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
		System.out.printf("Enter the package weight: ");
		double weight = input.nextDouble();

		if (weight > 20) {
			System.out.printf("The package cannot be shipped!");
		}

		else if ((weight > 0)&&(weight <= 1)) {
			System.out.printf("The shipping cost will be $3.50.");
		}
		if ((weight > 1)&&(weight <= 3)) {
			System.out.printf("The shipping cost will be $5.50.");
		}

		else if ((weight > 3)&&(weight <= 10)) {
			System.out.printf("The shipping cost will be $8.50.");
		}
		else if ((weight > 10)&&(weight <= 20)) {
			System.out.printf(" The shipping cost will be $10.50.");
		}

	}

}
