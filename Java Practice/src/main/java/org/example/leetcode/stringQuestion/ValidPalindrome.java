package org.example.leetcode.stringQuestion;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

//        s = s.replaceAll("^[A-Za-z0-9]", "").toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(ch);
            }
        }

        boolean isPalindrome = stringBuilder.toString().equalsIgnoreCase(stringBuilder.reverse().toString());

        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(String s) {


        return true;
    }
}
