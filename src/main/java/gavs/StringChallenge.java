package main.java.gavs;

import java.util.Arrays;

public class StringChallenge {

	public static void main(String[] args) {
		System.out.println(funStringChallenge("rkqodlw", "world")); // true
		System.out.println(funStringChallenge("cdore", "coder")); 	// true
		System.out.println(funStringChallenge("h3llko", "hello")); 	// false
	}

	private static boolean funStringChallenge(String str1, String str2) {
		return Arrays.asList(str1.split("(?!^)")).containsAll(Arrays.asList(str2.split("(?!^)")));
	}
}

/**
 * Question: String Challenge
 * 
 * Have the function StringChallenge(str1, str2) take both parameters beign
 * passed and return the string true if a portion of str1 characters can be
 * rearranged to match str2, otherwise return the string false.
 * 
 * 
 * For example: if str1 is 'rkqodlw' and str2 'world' the output should return
 * true. Punctuation and symbols will not be entered with the parameters.
 * 
 * More examples:
 * 
 * Input: 'cdore' & 'coder' 
 * Output: true
 * 
 * Input: 'h3llko' & 'hello' 
 * Output: false
 * 
 */