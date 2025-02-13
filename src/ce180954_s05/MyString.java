/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s05;

/**
 * Count the number of the appearance of letters in a string
 *
 * @author Le Khanh Dang _ CE180954 21/01/2025
 */
public class MyString {

    private int[] letter; // Array to store the count of each letter

    /**
     * Constructor to initialize the letter array
     */
    public MyString() {
        this.letter = new int[26]; // Initialize the array for 26 letters of the alphabet
    }

    /**
     * Method to count the occurrences of each letter in the input string
     *
     * @param input The input string to process
     */
    public void countLetter(String input) {
        for (char i : input.toCharArray()) { // Loop through each character in the input string
            if (Character.isLetter(i)) { // Check if the character is a letter
                char lowerCase = Character.toLowerCase(i); // Convert the letter to lowercase
                letter[lowerCase - 'a']++; // Increment the count for the corresponding letter
            }
        }
    }

    /**
     * Method to display the count of each letter
     */
    public void display() {
        for (int i = 0; i < letter.length; i++) { // Loop through the letter array
            if (letter[i] > 0) { // Check if the letter has any occurrences
                char letterIndex = (char) ('a' + i); // Convert the index back to the corresponding letter
                System.out.println(letterIndex + ": " + letter[i]); // Print the letter and its count
            }
        }
    }
}
