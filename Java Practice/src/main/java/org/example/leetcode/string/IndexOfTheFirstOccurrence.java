package org.example.leetcode.string;

import java.util.HashMap;

public class IndexOfTheFirstOccurrence {

    public static void main(String[] args) {
        System.out.println(strStr("leetcodee", "ee"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
//        for (int index = 0; index < haystack.length(); index++) {
//            if ((haystack.length() == 1 || haystack.length() - index > needle.length()) &&
//                    needle.equalsIgnoreCase(haystack.substring(index, needle.length() + index)))
        System.out.println(haystack.indexOf(needle));
//            return index;
//        }
        return -1;
    }
}
