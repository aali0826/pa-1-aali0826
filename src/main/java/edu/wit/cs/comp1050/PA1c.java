package edu.wit.cs.comp1050;

import java.util.Scanner;

//TODO: document this class
public class PA1c {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "Dollar amount must be non-negative!";
	
	/**
	 * Method to convert a double to
	 * an integer
	 * 
	 * @param num number to convert
	 * @return converted value
	 */
	public static int convertToInt(double num) {
		return (int) Math.round(num);
	}

	// TODO: document this method
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		//Strings
		String q = "quarters";
		String d = "dimes";
		String n = "nickels";
		String p = "pennies";
		String P = "penny";

		//multipliers
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;

		System.out.println("Enter total amount: $Dollar amount must be non-negative!");
		double dollars = sc.nextDouble();

		dollars = dollars*100;
		int dollarsInt = convertToInt(dollars);
		int numquarters = 0, numdimes = 0, numnickels = 0, numpennies = 0;

		if(dollarsInt >=0) {
			while (dollarsInt >= quarters) {
				dollarsInt = dollarsInt - quarters;
				numquarters++;
			}
			while (dollarsInt >= dimes) {
				dollarsInt = dollarsInt - dimes;
				numdimes++;
			}
			while(dollarsInt >= nickels) {
				dollarsInt = dollarsInt - nickels;
				numnickels++;
			}
			while(dollarsInt >= pennies) {
				dollarsInt = dollarsInt - pennies;
				numpennies++;
			}
			if (numquarters == 1) {
				q = "quarters";
			}
			if (numdimes == 1) {
				d = "dimes";
			}
			if (numnickels == 1) {
				n = "nickels";
			}
			if (numpennies == 1) {
				p = "pennies";
			}
			System.out.printf("You have %s %s, %s %s, %s %s, and %s %s.%n", numquarters, q, numdimes, d, numnickels, n, numpennies, p);
		}


	}


}
