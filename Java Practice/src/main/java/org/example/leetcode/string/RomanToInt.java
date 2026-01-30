package org.example.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);

        int returnable = 0;

        for (int i = 0; i < s.length(); i++) {

            Integer currentValue = romanValue.get(s.charAt(i));

            Integer nextValue = (i + 1 < s.length()) ? romanValue.get(s.charAt(i + 1)) : 0;

            if (currentValue < nextValue) {
                returnable += nextValue - currentValue;
                i++;
                continue;
            } else {

                returnable += currentValue;
            }
        }
        return returnable;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
    }

}
