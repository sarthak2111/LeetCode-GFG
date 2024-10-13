package com;

public class Person {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    public void setName(String name){
//        this.name  = name;
//    }


    public static void main(String[] args) {
        Person p = new Person("Sarthak",24);
        Person p1 = new Person("Abc", 20);
        System.out.println(p1.getAge()+ " : "+p1.getName());
        System.out.println(p.getAge()+ " : "+p.getName());
    }
}
