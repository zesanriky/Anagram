package com.assignment.anagrams.anagram_solver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author rahman
 *
 */

class AnagramCheckingAppTest {

	@Test
	void testAnagramCheckingApp() {

		// Case1: Checking two anagrams

		String firstString = "silent";
		String secondString = "listen";
		boolean expectedResultForTrue = true;
		boolean actualResultForTrue = AnagramCheckingApp.isAnagram(firstString, secondString);
		Assertions.assertEquals(expectedResultForTrue, actualResultForTrue);

		// Case2: Checking two anagrams

		String thirdString = "cat";
		String fourthString = "dog";
		boolean expectedResultForFalse = false;
		boolean actualResultForFalse = AnagramCheckingApp.isAnagram(thirdString, fourthString);
		Assertions.assertEquals(expectedResultForFalse, actualResultForFalse);

	}

	@Test
	void testIsAnagram() {

		// Testing for anagram validity

		assertTrue(AnagramCheckingApp.isAnagram("listen", "silent"));

		assertTrue(AnagramCheckingApp.isAnagram("debit card", "bad credit"));

		assertTrue(AnagramCheckingApp.isAnagram("the eyes", "they see"));

		// Testing for invalidity

		assertFalse(AnagramCheckingApp.isAnagram("hello", "world"));

		assertFalse(AnagramCheckingApp.isAnagram("abcd", "abcc"));

		assertFalse(AnagramCheckingApp.isAnagram("tree", "three"));

	}

	@Test
	void testCheckInputValidationPositive() {

		// Testing input validity

		String userInput = "anagram";
		String expected = "anagram";
		String actual = AnagramCheckingApp.checkInputValidation(userInput);
		assertEquals(expected, actual);

	}

	/**
	 * To test these cases the user needs to give input 1st input: abcdefghi, 2nd
	 * input = abcd and 3rd input = abcd then the test should pass 100% but it fails if
	 * the user inputs are not expected.
	 */

	// Test for valid input containing only alphabetic characters

	@Test
	public void testValidInput() {
		String input = "abcdefg";
		String expectedOutput = "abcdefg";
		String actualOutput = AnagramCheckingApp.checkInputValidation(input);
		assertEquals(expectedOutput, actualOutput);
	}

	// Test for invalid input containing non-alphabetic characters
	@Test
	public void testInvalidInput() {
		String input = "1234567";
		String expectedOutput = "abcd";
		String actualOutput = AnagramCheckingApp.checkInputValidation(input);
		assertEquals(expectedOutput, actualOutput);
	}

	// Test for input containing spaces
	@Test
	public void testInputWithSpaces() {
		String input = " abc def ghi ";
		String expectedOutput = "abcdefghi";
		String actualOutput = AnagramCheckingApp.checkInputValidation(input);
		assertEquals(expectedOutput, actualOutput);
	}

	// Test for input containing mixed case characters
	@Test
	public void testInputWithMixedCase() {
		String input = "AbCdEfG";
		String expectedOutput = "abcdefg";
		String actualOutput = AnagramCheckingApp.checkInputValidation(input);
		assertEquals(expectedOutput, actualOutput);
	}

	// Test for input containing special characters
	@Test
	public void testInputWithSpecialCharacters() {
		String input = "@#$%^&*()_+-=`~[]\\{}|;':\",./<>?";
		String expectedOutput = "abcd";
		String actualOutput = AnagramCheckingApp.checkInputValidation(input);
		assertEquals(expectedOutput, actualOutput);
	}

}
