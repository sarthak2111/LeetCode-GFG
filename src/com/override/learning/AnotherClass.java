package com.override.learning;

import java.util.HashSet;
import java.util.Iterator;

public class AnotherClass{
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Sarthak");
        Employee employee2 = new Employee(2, "Vicky");
        HashSet<Employee> map = new HashSet<Employee>();
        map.add(employee1);
        map.add(employee2);


        for (Iterator<Employee> it = map.stream().iterator(); it.hasNext(); ) {
            Employee e = it.next();
            System.out.println(e.hashCode() + " : "+ e.getName());
        }
    }
}