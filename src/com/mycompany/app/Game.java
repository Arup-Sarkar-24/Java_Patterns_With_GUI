package com.mycompany.app;

import com.mycompany.patterns.StarPatternPrinter;

import java.lang.reflect.Method;

public class Game {

    public static String play(String methodName, int rows, String str) {
        try {
            StarPatternPrinter patternPrinter = new StarPatternPrinter();
            // Find the method by name and parameter types
            Method method = patternPrinter.getClass().getMethod(methodName, int.class, String.class);
            // Invoke the method dynamically
            return (String) method.invoke(patternPrinter, rows, str);
        } catch (NoSuchMethodException e) {
            return "Error: Pattern not found.";
        } catch (Exception e) {
            return "Error executing Pattern: " + e.getMessage();
        }
    }
}
