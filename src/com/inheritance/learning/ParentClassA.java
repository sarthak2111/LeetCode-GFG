package com.inheritance.learning;

public class ParentClassA implements InterfaceA,InterfaceB {

//    @Override
//    public void printMessage() {
//        System.out.println("Printed from Parent");
//    }

    public static void main(String[] args) {
        ParentClassA obj = new ParentClassA();
        obj.printMessage();
        InterfaceB.printMessage();
    }

    @Override
    public void printMessage() {
        InterfaceA.super.printMessage();
    }
}
