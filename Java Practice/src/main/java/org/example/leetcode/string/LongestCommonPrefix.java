package org.example.leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";
        Arrays.sort(strs);
        int minLength = strs[0].length();

        int i = 0;
        while (i < minLength) {
            for (String s : strs) {
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }

        return strs[0].substring(0, i);

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flasfbia", "flasfas"}));
    }

}
