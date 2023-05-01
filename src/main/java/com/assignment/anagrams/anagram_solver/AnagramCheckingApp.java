package com.assignment.anagrams.anagram_solver;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rahman
 *
 */

public class AnagramCheckingApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			// Expecting the first String input from the user
			System.out.println("Please enter the first String or type 'exit' to to close this program");
			String firstString = checkInputValidation(input.nextLine());

			// This program will be terminated if the user enters 'exit'
			if (firstString.equalsIgnoreCase("exit")) {

				System.out.println("Good bye see you again, your program has been terminated.");
				break;
			}

			// Expecting the second String input from the user
			System.out.println("Please enter the second String");
			String secondString = checkInputValidation(input.nextLine());

			// Now comparing between the two Strings if they are anagrams or not.

			if (isAnagram(firstString, secondString)) {

				System.out.println("Your given two Strings are anagrams");

			}

			else {

				System.out.println("The given Strings are not anagrams");

			}
		}
		// Closing the user input

		input.close();

	}

	/**
	 * @param firstString
	 * @param secondString
	 * @return
	 */

	// Checking the given Strings anagrams possibility
	public static boolean isAnagram(String firstString, String secondString) {

		// Conversion from strings to character arrays

		char[] firstArray = firstString.toCharArray();
		char[] secondArray = secondString.toCharArray();

		// Sorting out the arrays with the help of a method

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		return Arrays.equals(firstArray, secondArray);
	}

	/**
	 * @param input
	 * @return
	 */

	// Checking is the user has only entered the alphabetic characters.

	public static String checkInputValidation(String input) {

		// Removing any leading/trailing white space and converting to lower case
		String modifyInput = input.trim().toLowerCase();

		// Defining regular expression for accepting alphabetic characters only.
		String regex = "^[a-z]+$";

		// Help of regular expression to match inputs

		if (modifyInput.matches(regex)) {

			return modifyInput;

		} else {
			System.out.println("Sorry wrong input, please enter only alphabetic characters.");

			Scanner inputRepeat = new Scanner(System.in);

			String userInput = inputRepeat.nextLine();

			return checkInputValidation(userInput);

		}

	}

}
