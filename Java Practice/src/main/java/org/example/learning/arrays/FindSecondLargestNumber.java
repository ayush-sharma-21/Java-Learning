package org.example.learning.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class FindSecondLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }

        list.sort(Comparator.reverseOrder());

        System.out.println(list.stream().max(Comparator.naturalOrder()));
        list.forEach(System.out::println);
        System.out.println(list.get(1));

    }
}
