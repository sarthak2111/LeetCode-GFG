package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NewComparatorImpl implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length()){
            return 1;
        }
        if(o1.length()<o2.length()){
            return -1;
        }
        if(o1.length()==o2.length()){
            return o1.compareTo(o2);
        }
        return 0;
    }

    public static void main(String[] args) {
        NewComparatorImpl comparator = new NewComparatorImpl();
        List<String> list = Arrays.asList("ac", "abs", "abb");
        Optional<String> opList = list.stream().max(String::compareTo);
    }
}
