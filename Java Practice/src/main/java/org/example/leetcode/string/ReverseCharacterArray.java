package org.example.leetcode.string;

public class ReverseCharacterArray {
    public static void main(String[] args) {
        reverseString(new char[]{'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'});
    }

    public static void reverseString(char[] s) {

        int length = s.length;
        for (int i = 0; i < (s.length - 1) / 2; i++) {
            if (length > 0) {
                char temp = s[i];
                s[i] = s[length - 1];
                s[length - 1] = temp;
                length -= 1;
            }
        }
        System.out.println(s);
    }
}

//amanaP :lanac a ,nalp a ,nam A
//amanaP :lanac  a,nalp a ,nam A