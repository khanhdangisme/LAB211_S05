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
public class CE180954_S05 {

    /**
     * Main method to execute the program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IO io = new IO(); // Create an instance of IO class to handle input
        MyString mString = new MyString(); // Create an instance of MyString class to process letters

        String input = io.getInputString("Enter a string: "); // Prompt the user to enter a string
        mString.countLetter(input); // Count the occurrences of each letter in the input string
        mString.display(); // Display the letter counts
    }
}
