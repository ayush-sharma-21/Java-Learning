package org.example.leetcode.string;

import java.util.*;

public class MaxSubStringOfDistinctStart {
    public static void main(String[] args) {
        String s = "abababa";
//        int count = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashSet<Character> characters = new HashSet<>();
//        for (Character ch : s.toCharArray()) {
//            characters.add(ch);
//        }
//        System.out.println(map.size());
        System.out.println(s.chars().distinct().count());
    }
}
