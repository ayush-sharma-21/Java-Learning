package org.example.learning.arrays;

import java.util.ArrayList;
import java.util.Random;

public class ReverseAnArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }
    }

}
