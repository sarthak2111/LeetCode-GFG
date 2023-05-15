package com.streams.learning;

import java.util.*;

public class StreamLearning implements Comparator {
    public static void main(String[] args)  {
        List<String> list = new ArrayList<>(Arrays.asList("Rahul","Aam","Baj","Rajesh"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        HashMap<String, String> map = new HashMap<>(){
            @Override
            public String get(Object key) {
                return "abc";
            }

        };
        System.out.println(map.get("RANDOM"));
    }


    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().length() - o2.toString().length();
    }
}
