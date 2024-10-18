package com.mycompany.userInput;

import javax.swing.*;

public class InputHandler {

    public int getNumberOfRows() {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter the number of rows:");
            if (input == null) {
                return -1; // Handle cancel operation
            }

            try {
                int rows = Integer.parseInt(input);
                if (rows >= 3) {
                    return rows; // Return valid number of rows
                } else {
                    JOptionPane.showMessageDialog(null, "Pattern can't be created with less than 3 rows. Please try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }

    public String getStringInput() {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter a string:");
            if (input == null || input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Input cannot be empty. Please enter a valid string.");
            } else {
                return input; // Return the valid input
            }
        }
    }
}
