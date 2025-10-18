package org.lecture;

public class PalindromeChecker {

    static void main() {

        String palindrome = "ROTOR";

        System.out.println("palindrome = " + isPalindrome(palindrome.toLowerCase(), 0, palindrome.length() - 1));

    }


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
