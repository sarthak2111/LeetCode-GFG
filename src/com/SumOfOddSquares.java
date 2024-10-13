package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddSquares {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(8,9,10,1,2,3,4,5,6);
        List<Integer> evenOutput = input.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        List<Integer> oddOutput = input.stream().filter(integer -> integer%2!=0).collect(Collectors.toList());
        evenOutput.stream().forEach(integer -> Integer.valueOf(integer*integer));
        System.out.println(evenOutput);
    }
}
