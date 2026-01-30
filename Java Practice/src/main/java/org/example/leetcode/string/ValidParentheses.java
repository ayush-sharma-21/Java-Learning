package org.example.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static final HashMap<Character, Integer> characterHashMap = new HashMap<Character, Integer>() {{
        put('{', 1);
        put('[', 2);
        put('(', 3);
        put(']', -2);
        put('}', -1);
        put(')', -3);
    }};

    public static final HashMap<Character, Character> chHashMap = new HashMap<Character, Character>() {{
        put(']', '[');
        put('}', '{');
        put(')', '(');
    }};

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (!chHashMap.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.pop() != chHashMap.get(ch)) {
                    return false;
                }
            }
            //            count += characterHashMap.get(ch);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}({{[]})[]"));
    }
}
