package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public static void main(String[] args) {
        System.out.println(countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.size(); i++) {
            int moving_pointer = i + 1;
            while (moving_pointer != nums.size()) {
                if (nums.get(i) + nums.get(moving_pointer) < target) {
                    counter++;
                }
                moving_pointer++;
            }
        }
        return counter;
    }
}
