package com.mycompany.app;

import com.mycompany.userInput.InputHandler;
import com.mycompany.patterns.StarPatternPrinter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Pattern Printer GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Map to hold formatted method names and their original names
        Map<String, String> methodMap = new LinkedHashMap<>();

        // Dynamically get the methods from the PatternPrinter class
        Method[] methods = StarPatternPrinter.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getParameterCount() == 2 &&
                    method.getParameterTypes()[0] == int.class &&
                    method.getParameterTypes()[1] == String.class) {
                // Format the method name and add it to the map
                String formattedName = formatString(method.getName());
                methodMap.put(formattedName, method.getName());
            }
        }

        // Sort the formatted method names alphabetically
        List<String> sortedMethodNames = new ArrayList<>(methodMap.keySet());
        Collections.sort(sortedMethodNames);

        // Convert the list to an array for the dropdown
        String[] patternOptions = new String[sortedMethodNames.size() + 1];
        patternOptions[0] = "Select";
        for (int i = 0; i < sortedMethodNames.size(); i++) {
            patternOptions[i + 1] = sortedMethodNames.get(i);
        }

        // Add a label for instructions
        JLabel instructionLabel = new JLabel("Select a pattern:");
        frame.add(instructionLabel);

        // Create a dropdown for pattern selection
        JComboBox<String> patternDropdown = new JComboBox<>(patternOptions);
        frame.add(patternDropdown);

        // Add a button to trigger the action
        JButton generateButton = new JButton("Generate Pattern");
        frame.add(generateButton);

        // Add an "Exit" button
        JButton exitButton = new JButton("Exit");
        frame.add(exitButton);

        // Add an area to display output
        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(scrollPane);

        // Action listener for the generate button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputHandler inputHandler = new InputHandler();

                // Get the selected pattern choice
                int selectedIndex = patternDropdown.getSelectedIndex();
                if (selectedIndex == 0) {
                    outputArea.setText("Please select a valid pattern.");
                    return;
                }
                String selectedFormattedName = patternDropdown.getSelectedItem().toString();
                String originalMethodName = methodMap.get(selectedFormattedName);

                // Get user inputs for rows and string
                int rows = inputHandler.getNumberOfRows();
                if (rows == -1) {
                    outputArea.setText("Operation cancelled.");
                    return;
                }
                String str = inputHandler.getStringInput();

                // Generate and display the pattern
                String result = Game.play(originalMethodName, rows, str);
                outputArea.setText(result);

                // Adjust the output area size based on the content length
                int lines = result.split("\n").length;
                int columns = Math.max(result.length() / lines, 30);
                outputArea.setRows(Math.min(lines, 50));
                outputArea.setColumns(Math.min(columns, 70));

                // Resize the window based on the new JTextArea size
                frame.pack();
            }
        });

        // Action listener for the exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the program
            }
        });

        // Set frame visibility
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    // Method to format the string
    private static String formatString(String input) {
        // Use a StringBuilder to build the formatted string
        StringBuilder formattedString = new StringBuilder();

        // Convert the first character to uppercase
        formattedString.append(Character.toUpperCase(input.charAt(0)));

        // Iterate through the rest of the characters
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the character is uppercase, add a space before it
            if (Character.isUpperCase(currentChar)) {
                formattedString.append(' ');
            }

            // Add the character to the formatted string
            formattedString.append(currentChar);
        }

        // Return the formatted string
        return formattedString.toString();
    }
}
