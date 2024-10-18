package com.mycompany.display;

import java.lang.reflect.Method;

public class MethodLister {

    // Method to list all methods in a specified class with an index
    public static void listMethods(Class<?> cls) {
        // Get all the methods declared in the class
        Method[] methods = cls.getDeclaredMethods();

        // Print the total number of methods
        //System.out.println("Total number of methods: " + methods.length);

        // Print each method name with an index
        System.out.println("Pattern Options : ");//Methods in the class
        for (int i = 0; i < methods.length; i++) {
            System.out.println((i + 1) + " -> " + methods[i].getName());
        }
    }
}

