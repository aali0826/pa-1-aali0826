PA1 - Review
============
A programming assignment, broken into five parts, to focus on getting students accustomed to Eclipse, JUnit, Javadoc, and GitLab, as well as review CS1 topics.
package edu.wit.cs.comp1050;

import java.util.Scanner;
  public class PA1e {
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
  
