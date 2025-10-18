package org.lecture;

import java.util.concurrent.ThreadLocalRandom;

public class PalindromeChecker {

    static void main() {

        String palindrome = "ROTOR";

        System.out.println("palindrome = " + isPalindrome(palindrome.toLowerCase(), 0, palindrome.length() - 1));
        System.out.println("palindrome = " + isPalindromeSimpleCheck(palindrome.toLowerCase()));

    }


    /**
     * Checks whether the given string is a palindrome using a simple reverse comparison.
     *
     * @param s the input string to check for being a palindrome
     * @return true if the input string is a palindrome, false otherwise
     */
    private static boolean isPalindromeSimpleCheck(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    /**
     * Recursively checks whether the input string is a palindrome within a specified range.
     *
     * @param s the input string to check
     * @param left the starting index of the substring to evaluate
     * @param right the ending index of the substring to evaluate
     * @return true if the specified substring is a palindrome, false otherwise
     */
    private static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true; // base case
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false; // mismatch
        }
        return isPalindrome(s, left + 1, right - 1); // move inward
    }

}
