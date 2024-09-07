package com.github.renuka.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

    public static void main(String[] args) {
    /*
    Given two strings s and t, return true if t is an  anagram of s, and false otherwise.
     */
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }




}
