package com.java.fundamentals;

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Initial Value");
        passByReferenceValue(sb);
        System.out.println(sb);// sb = Initial Value Final Value added
        int a = 10;
        passByValue(a);
        System.out.println(a); // a=10

        printVariableArgs("Hummer EV", "CyberTruck");

    }

    /*
        1. Introduced in Java 5, It's possible to give variable arguments of same type
           including zero arguments to a method as input using ...
        2. Internally all the arguments will be stored as array of the type mentioned.
        3. when the method overloading is done using varArgs we cannot call that method
           without giving arguments as JVM would be confused as of to call appropriate
           method
     */
    static void printVariableArgs(String ...varArgs) {
        System.out.println(Arrays.toString(varArgs));
    }

    /*
        Primitive values are passed by their values
     */
    static void passByValue(int a) {
        a = 30;
    }
    /*
        Objects are passed by their reference value
     */
    static void passByReferenceValue(StringBuilder sb) {
        sb.append(" Final Value added");
    }
}