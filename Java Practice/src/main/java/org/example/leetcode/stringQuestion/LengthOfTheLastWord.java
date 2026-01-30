package org.example.leetcode.stringQuestion;

import java.util.HashMap;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = " Hello World  ";

        char[] chars = s.toCharArray();
        int length = chars.length - 1;
        int lastWordLength = 0;
//        for (int i = length - 1; i >= 0; i--) {
//
//            if (i == 1) {
//                lastWordLength++;
//                break;
//            }
//
//            if (chars[i] == ' ')
//                continue;
//
//            if (Character.isAlphabetic(chars[i])) {
//                lastWordLength++;
//                if (chars[i] == ' ') {
//                    break;
//                }
//            }
//        }

//        int spaceCountInString = 0;
//
//        HashMap<Integer, String> map = new HashMap<>();
//        int head = 0;
//        int count = 0;
//        for (int j = 0; j < length; j++) {
//            if (!Character.isAlphabetic(s.charAt(j))) {
//                head = j;
//                continue;
//            } else if (Character.isAlphabetic(s.charAt(j)) && s.charAt(j + 1) != ' ') {
//                count++;
//            }
//        }

        while (length >= 0 && s.charAt(length) == ' ')
            length--;

        while (length >= 0 && s.charAt(length) != ' ') {
            lastWordLength++;
            length--;
        }

        System.out.println(lastWordLength);
    }
}
