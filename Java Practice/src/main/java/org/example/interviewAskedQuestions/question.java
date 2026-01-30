package org.example.interviewAskedQuestions;

import java.util.LinkedHashMap;

public class question {

//  Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//  Example 1:
//  Input: s = "meetandgreet"
//  Output: 0
//  Explanation:
//  The character 'l' at index 0 is the first character that does not occur at any other index.
//  Example 2:
//  Input: s = "lovecodingandlearning"
//  Output: 2
//  Example 3:
//  Input: s = "aabb"
//  Output: -

    public static int firstUniqChar(String s) {
//    int[] freq = new int[256]; // ASCII characters
//
//    // Step 1: Count frequency
//    for (char c : s.toCharArray()) {
//      freq[c]++;
//    }
//
//    // Step 2: Find first unique character
//    for (int i = 0; i < s.length(); i++) {
//      if (freq[s.charAt(i)] == 1) {
//        return i;
//      }
//    }

        LinkedHashMap<Character, Integer> characterIntegerLinkedHashMap = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            if (characterIntegerLinkedHashMap.get(ch) == null || characterIntegerLinkedHashMap.get(ch) == 0)
                characterIntegerLinkedHashMap.put(ch, 1);
            else
                characterIntegerLinkedHashMap.put(ch, characterIntegerLinkedHashMap.get(ch) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (characterIntegerLinkedHashMap.get(s.charAt(i)) == 1) {
                return i;
            }
            continue;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("meetandgreet")); // 0
        System.out.println(firstUniqChar("lovecodingandlearning")); // 2
        System.out.println(firstUniqChar("aabb")); // -1
    }
}