package edu.wit.cs.comp1050;

import java.util.Scanner;

//TODO: document this class
public class PA1e {
	
	/**
	 * Counts the number of upper case characters
	 * within the supplied string
	 * 
	 * @param s input string
	 * @return number of upper case characters
	 */
	public static int numUpperCase(String s) {
		return 0; // TODO: replace with your method implementation
	}

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a String: ");

		String str = input.nextLine();
		System.out.printf("There are " + countUppercase(str) + " uppercase letters in \"" + str + "\".");
	}
	public static int countUppercase(String str) {
		int count = 0;
		int length = str.length()-1;
		return countUppercase(str, length, count);
	}
	private static int countUppercase(String str, int length, int count) {
		if (length < 0)
			return count;
		else if (Character.isUpperCase(str.charAt(length)))
			return countUppercase(str, length - 1, count + 1);
		else
			return countUppercase(str, length - 1, count);
	}
	}


