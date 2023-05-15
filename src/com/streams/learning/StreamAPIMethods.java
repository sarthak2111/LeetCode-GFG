package com.streams.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aaaa","Ab","Ac"));
        list = list.stream().filter(a -> a.length()>3).collect(Collectors.toList());
        String str = list.stream().reduce("",(str1,a) -> str1+a.toUpperCase());
        System.out.println(str);
    }
}
