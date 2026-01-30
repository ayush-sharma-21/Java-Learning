package org.example.leetcode.string;

public class ReverseStringPrefix {

    public static void main(String[] args) {
        System.out.println(reversePrefix("ayush",3));
    }

    public static String reversePrefix(String s, int k) {

        int left = 0;
        int right = k - 1;
        StringBuilder str = new StringBuilder(s);
        while (left < right) {
            char ch = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, ch);

            left++;
            right--;
        }
    return str.toString();

    }

}
