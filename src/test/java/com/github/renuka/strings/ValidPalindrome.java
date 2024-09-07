package com.github.renuka.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
    /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
     */

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        StringBuilder current = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                current.append(character);
            }
        }

        StringBuilder reverse = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(c[i])) {
                reverse.append(c[i]);
            }
        }
        return current.toString().equalsIgnoreCase(reverse.toString());
    }
}
