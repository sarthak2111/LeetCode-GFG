package com.override.learning;

import java.util.HashSet;
import java.util.Iterator;

public class Employee {
    int id;

    public String getName() {
        return name;
    }

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name == employee.name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
}

