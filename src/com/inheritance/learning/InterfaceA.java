package com.inheritance.learning;

public interface InterfaceA {
    default void printMessage(){
        System.out.println("Printed from InterfaceA");
    }

}
