package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Data {

  public static void main(String[] args) {
    // Find the second highest salary using Java 8 Stream
    // Find out the numbers starting with 1 using java 8
    // Find duplicate elements using java 8
    HashSet<Integer> integers = new HashSet<>();
    List<Integer> salaries = Arrays.asList(10000, 5000, 8000, 3000, 12000, 8000, 15000);
    salaries.stream().sorted((a, b) -> (b - a)).skip(1).limit(1).forEach(System.out::println);
    salaries.stream().filter(s -> s.toString().startsWith("1")).forEach(System.out::println);
    salaries.stream().filter(s -> !integers.add(s)).forEach(System.out::println);
    salaries.stream().distinct().forEach(System.out::println);
    //        find the missing number in an array of integers
    //        int[] nums = {1, 2, 4, 6, 3, 7, 8};

  }

}
