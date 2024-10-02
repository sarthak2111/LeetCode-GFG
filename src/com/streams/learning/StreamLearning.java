package com.streams.learning;

import java.util.*;
import java.util.stream.Collectors;

public class StreamLearning {
    public static void main(String[] args)  {
        List<String> list = new ArrayList<>(Arrays.asList("35","30","34","5","9","999"));
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        String output = list.stream().collect(Collectors.joining());
        System.out.println(list);
        System.out.println(output);
    }
}
