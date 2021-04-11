package main.java.gavs;

import java.util.Arrays;

public class ArrayChallenge {
	public static void main(String[] args) {
		System.out.println(funArrayChallenge(new int[] { 5, 7, 16, 1, 2 })); 	// false
		System.out.println(funArrayChallenge(new int[] { 3, 5, -1, 8, 12 })); 	// true
		System.out.println(funArrayChallenge(new int[] { 4, 6, 23, 10, 1, 3 }));// true
	}

	private static boolean funArrayChallenge(int[] inputArray) {

		Arrays.sort(inputArray);
		int len = inputArray.length;
		int largestValue = inputArray[len - 1];
		int sumOfRemainingElems = Arrays.stream(inputArray).sum() - largestValue;

		// return false if sum of all elements(except largest) lesser than the largest value
		if (sumOfRemainingElems < largestValue) {
			return false;
		} else if (sumOfRemainingElems == largestValue) {
			return true;
		}

		// check if sum of all elements(except largest) greater than the largest value
		int sum = 0;
		for (int i = 0; i < len - 1; i++) {
			if (inputArray[i] < 0) {
				sum = sumOfRemainingElems + inputArray[i];
			} else {
				sum = sumOfRemainingElems - inputArray[i];
			}

			if (sum == largestValue) {
				return true;
			}
		}
		return false;
	}
}

/**
 * Question: Array Challenge
 * 
 * Have the function ArrayChallenge(arr) take the array of numbers stored in arr
 * and return the string true if any combination of numbers in the
 * array(excluding the largest number) can be added up to equal the largest
 * number in the array, otherwise return the largest string false.
 * 
 * For example:
 * 
 * if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23.
 * 
 * Note: The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 * 
 * More examples:
 * 
 * Input: new int[] {5, 7, 16, 1, 2} 
 * Output: false
 * 
 * Input: new int[] {3, 5, -1, 8, 12} 
 * Output: true
 * 
 */