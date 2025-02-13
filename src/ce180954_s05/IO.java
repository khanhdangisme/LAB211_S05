/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s05;

import java.util.Scanner;

/**
 * Count the number of the appearance of letters in a string
 *
 * @author Le Khanh Dang _ CE180954 21/01/2025
 */
public class IO {

    /**
     * Method to get a valid input string from the user
     *
     * @param msg The message to display prompting user input
     * @return A validated string containing only alphanumeric characters and
     * spaces
     */
    public String getInputString(String msg) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        String input; // Variable to store the user input
        while (true) {
            try {
                System.out.print(msg); // Display the prompt message
                input = sc.nextLine(); // Read the input string
                if (!input.matches("[a-zA-Z0-9 ]+") || input.trim().isEmpty()) { // Check if input contains only valid characters and empty
                    throw new IllegalArgumentException(); // Throw exception if invalid
                } 
                return input; // Return valid input
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid"); // Inform the user about invalid input
            }
        }
    }
}
