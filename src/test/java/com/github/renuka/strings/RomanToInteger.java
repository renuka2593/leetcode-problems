package com.github.renuka.strings;

import java.util.Map;

public class RomanToInteger {
    final String I = "1";
    final String V = "5";
    final String X = "10";
    final String L = "50";
    final String C = "100";
    final String D = "500";
    final String M = "1000";

    public static void main(String args[]) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToInt = Map.of(
                'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        char[] arr = s.toCharArray();
        int num = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && romanToInt.get(arr[i]) < romanToInt.get(arr[i + 1])) {
                sum = romanToInt.get(arr[i + 1]) - romanToInt.get(arr[i]);
                i = i + 1;
            } else {
                sum = romanToInt.get(arr[i]);

            }
            num = num + sum;
        }
        return num;
    }

}
