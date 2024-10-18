package com.mycompany.patterns;

public class StarPatternPrinter {

    // Prints the right-aligned triangle pattern based on given rows and string
    /*
    Right Aligned Triangle-------------->>>>>

        *
      * *
    * * *
  * * * *
* * * * *

     */
    public String rightTrianglePattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("Right Aligned Triangle-------------->>>>>\n\n");

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                pattern.append("  "); // Add spaces for right alignment
            }
            // Print the specified string
            for (int j = 0; j <= i; j++) {
                pattern.append(str).append(" ");
            }
            pattern.append("\n"); // Move to the next line
        }
        return pattern.toString(); // Return the pattern as a string
    }


    // Prints the left-aligned triangle pattern based on given rows and string
    /*
    Left Aligned Triangle-------------->>>>>

*
* *
* * *
* * * *
* * * * *

     */
    public String leftTrianglePattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("Left Aligned Triangle-------------->>>>>\n\n");

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= i; k++) {
                pattern.append(str).append(" "); // Print the string
            }
            pattern.append("\n"); // Move to the next line
        }
        return pattern.toString(); // Return the pattern as a string
    }


    // Prints the Square Star Pattern based on given rows and string
    /*
    A square with stars-------------->>>>>

* * *
* * *
* * *

     */
    public String squarePattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A square with stars-------------->>>>>\n\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                pattern.append(str);
                if (j < rows - 1) { // Add a space if it's not the last element in the row
                    pattern.append(" ");
                }
            }
            pattern.append("\n");
        }
        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Inverted Pyramid Star Pattern based on given rows and string
    /*
    An inverted pyramid with stars-------------->>>>>

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

     */
    public String invertedPyramidPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("An inverted pyramid with stars-------------->>>>>\n\n");

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                pattern.append("  "); // Increase leading spaces for each row
            }
            // Print stars
            for (int k = 0; k < (2 * (rows - i) - 1); k++) {
                pattern.append(str).append(" "); // Print the stars
            }
            pattern.append("\n"); // Move to the next line
        }
        return pattern.toString(); // Return the pattern as a string
    }


    // Prints the Pyramid Star Pattern based on given rows and string
    /*
    A pyramid with stars-------------->>>>>

        *
      * * *
    * * * * *
  * * * * * * * *
* * * * * * * * * * *

     */
    public String pyramidPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A pyramid with stars-------------->>>>>\n\n");
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = rows - i; j > 1; j--) {
                pattern.append(" "); // Print space for center alignment
            }
            // Print asterisks
            for (int k = 0; k < (2 * i + 1); k++) {
                pattern.append(str).append(" "); // Print the stars
            }
            pattern.append("\n"); // Move to the next line
        }
        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Diamond Star Pattern based on given rows and string

    /*
    A diamond shape with stars-------------->>>>>

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

     */

    public String diamondPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A diamond shape with stars-------------->>>>>\n\n");

        // Upper half of the diamond
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = rows - 1; j > i; j--) {
                pattern.append(" "); // Adjust for proper spacing
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                pattern.append(str).append(" "); // Print the stars
            }
            pattern.append("\n"); // Move to the next line
        }

        // Lower half of the diamond
        for (int i = rows - 2; i >= 0; i--) { // Start from rows - 2
            // Print leading spaces
            for (int j = rows - 1; j > i; j--) {
                pattern.append(" "); // Adjust for proper spacing
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                pattern.append(str).append(" "); // Print the stars
            }
            pattern.append("\n"); // Move to the next line
        }

        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Hollow Square Star Pattern based on given rows and string

    /*
    A square but leaves the middle portion hollow-------------->>>>>

* * * * *
*       *
*       *
*       *
* * * * *

     */

    public String hollowSquarePattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A square but leaves the middle portion hollow-------------->>>>>\n\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                // Check if it's a border position
                if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1)
                    pattern.append(str).append(" ");
                else
                    pattern.append("  "); // Leave the middle hollow
            }
            pattern.append("\n"); // Move to the next line after finishing a row
        }
        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Butterfly Star Pattern based on given rows and string

    /*
    A butterfly, with two symmetrical sides filled with stars-------------->>>>>

 *           *
 * *       * *
 * * *   * * *
 * * * * * * *
 * * * * * * *
 * * * * * * *
 * * *   * * *
 * *       * *
 *           *

     */
    public String butterflyPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A butterfly, with two symmetrical sides filled with stars-------------->>>>>\n\n");

        // Upper half of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Print left half of the row
            for (int j = 1; j <= i; j++) {
                pattern.append(str).append(" ");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (rows - i); j++) {
                pattern.append("  "); // Use two spaces for proper alignment
            }
            // Print right half of the row
            for (int j = 1; j <= i; j++) {
                pattern.append(str).append(" ");
            }
            pattern.append("\n");
        }

        // Lower half of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Print left half of the row
            for (int j = 1; j <= i; j++) {
                pattern.append(str).append(" ");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (rows - i); j++) {
                pattern.append("  "); // Use two spaces for proper alignment
            }
            // Print right half of the row
            for (int j = 1; j <= i; j++) {
                pattern.append(str).append(" ");
            }
            pattern.append("\n");
        }
        return pattern.toString(); // Return the pattern as a string
    }


    // Prints the Downward Triangle Star Pattern based on given rows and string
    public String downwardTrianglePattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A downward-facing triangle with stars-------------->>>>>\n\n");
        // Loop to print rows
        for (int i = rows; i >= 1; i--) {
            // Loop to print asterisks in each row
            for (int j = 1; j <= i; j++) {
                pattern.append(str).append(" ");
            }
            // Move to the next line after each row
            pattern.append("\n");
        }
        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Hollow Diamond Star Pattern based on given rows and string

    /*
    A diamond shape with stars, leaving the middle portion hollow-------------->>>>>

        *
      *   *
    *       *
  *           *
* * * * * * * * *
  *           *
    *       *
      *   *
        *

     */
    public String hollowDiamondPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A diamond shape with stars, leaving the middle portion hollow-------------->>>>>\n\n");

        // Upper half of the diamond
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                pattern.append("  "); // Two spaces for better alignment
            }

            // Print left side of the upper half
            pattern.append(str).append(" "); // Print left edge

            // Print spaces in the middle
            if (i > 0) { // Avoid printing spaces for the top point
                for (int k = 0; k < 2 * i - 1; k++) {
                    pattern.append("  "); // Two spaces for hollow effect
                }
                pattern.append(str).append(" "); // Print right edge
            }
            pattern.append("\n");
        }

        // Lower half of the diamond
        for (int i = rows - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                pattern.append("  "); // Two spaces for better alignment
            }

            // Print left side of the lower half
            pattern.append(str).append(" "); // Print left edge

            // Print spaces in the middle
            if (i > 0) { // Avoid printing spaces for the bottom point
                for (int k = 0; k < 2 * i - 1; k++) {
                    pattern.append("  "); // Two spaces for hollow effect
                }
                pattern.append(str).append(" "); // Print right edge
            }
            pattern.append("\n");
        }
        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Hollow Pyramid Star Pattern based on given rows and string

    /*
    A pyramid with stars, leaving the middle portion hollow-------------->>>>>

        *
      *   *
    *       *
  *           *
* * * * * * * * *

     */
    public String hollowPyramidPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A pyramid with stars, leaving the middle portion hollow-------------->>>>>\n\n");

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = rows - 1; j > i; j--) {
                pattern.append("  "); // Two spaces for better alignment
            }

            // Print the first and last rows
            if (i == 0) {
                pattern.append(str).append("\n"); // Top point of the pyramid
            } else if (i == rows - 1) {
                // Print the last row with stars only at the edges
                for (int k = 0; k < 2 * rows - 1; k++) {
                    pattern.append(str).append(" ");
                }
            } else {
                // Print the first star
                pattern.append(str).append(" ");

                // Print spaces inside the pyramid
                for (int k = 1; k < 2 * i - 1; k++) {
                    pattern.append("  "); // Two spaces for hollow effect
                }

                // Print the second star, only if it's not the first or last row
                pattern.append(str);
            }

            // Move to the next line
            pattern.append("\n");
        }
        return pattern.toString(); // Return the pattern as a string
    }

    // Prints the Cross Star Pattern based on given rows and string
    /*
    A cross shape with stars-------------->>>>>

        *
        *
* * * * * * * *
        *
        *

     */
    public String crossPattern(int rows, String str) {
        StringBuilder pattern = new StringBuilder("A cross shape with stars-------------->>>>>\n\n");

        // Ensure rows is odd for a symmetrical cross
        if (rows % 2 == 0) {
            return "Please provide an odd number of rows for a symmetric cross pattern.\n";
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                // Check if the current position is in the center row or center column
                if (i == rows / 2 || j == rows / 2) {
                    pattern.append(str).append(" ");
                } else {
                    pattern.append("  ");
                }
            }
            // Move to the next line after each row
            pattern.append("\n");
        }
        return pattern.toString(); // Return the pattern as a string
    }


}



