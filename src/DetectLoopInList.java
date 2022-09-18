package com.spring.mongo.api;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.*;

public class DetectLoopInList {
    Node head;
    static public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public Integer pop() {
        Integer poppedValue =Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("Empty LL");
        }
        else{
            poppedValue = head.data;
            head = head.next;
        }
        return poppedValue;
    }
    public boolean push(Integer x){
        if(head==null){
            head = new Node(x);
            return true;
        }
        else{
           Node node = new Node(x);
           Node temp = head;
           head=node;
           node.next=temp;
        }
        return false;
    }
    public static int lengthOfLongestSubstring(String s) {
        int max= 0,l=0;
        Set<Character> set = new HashSet<Character>();

        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l=l+1;
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);

        }
        return max;
    }

    public static void main(String[] args) {
        int a =lengthOfLongestSubstring("pwwkew");
        String str = "aabbcccbd";
        String expectedOutput = "aad";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] s = str.split("");
        for (String x : s) {
            if (map.containsKey(x)) {
                int c = map.get(x);
                c++;
                map.put(x, c);
            } else {
                map.put(x, 1);
            }
        }
        Set<String> set = map.keySet();
        HashMap<String,Integer> remove = new HashMap<>();
        remove.putAll(map);
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        System.out.println(q.offer(1)+" : "+q.offer(2));
        for (String k : set) {
            if (map.get(k) == 3) {
                remove.put(k,3);
            }
        }
        StringBuilder sb= new StringBuilder();
        for (String x : s) {
            if (!remove.containsKey(x)) {
                sb.append(x);
            }
        }
        System.out.println(sb);
        //Pair p = new Pair('2','3');
        //System.out.println(p);
    }

}
