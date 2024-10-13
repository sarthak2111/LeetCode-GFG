package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionRadisys {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(8,9,10,1,2,3,4,5,6);
        List<Integer> output = new ArrayList<>();
        int current = 0;
        if(input.size()>1){
            current = input.get(0);
            output.add(current);
        }
        for(int i=1; i< input.size(); i++){
            if(input.get(i)==current+1){
                output.add(input.get(i));
                current = input.get(i);
            }
            else{
                current = input.get(0);
                output.add(current);
            }
        }
        System.out.println(output);
    }
}
