package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 6.5

        Scanner userInput = new Scanner(System.in);

        System.out.println("Type a word and let's see if it's a doubloon!");

        // Program waits for an input.
        while (userInput.hasNextDouble()) {
            String notAWord = userInput.next();
            System.err.println("is not a word! Try again!"); // Will give an error message if it isn't a word that have been entered.
        }
            String word = userInput.next();

        // Invoke method "isDoubloon"
        if (isDoubloon(word)) {
            System.out.println("Word: " + word + " is a dooubloon.");
        }else{
            System.out.println("Word: " + word + " is not a doubloon.");
        }

    }

    public static boolean isDoubloon(String text) {

        // String converted to lowercase.
        String lowerCaseText = text.toLowerCase();

        // This "for" loop starts at index "1" and then the inner loop checks if there is any matching letters to index "1".
        for (int i = 1; i < lowerCaseText.length(); i++) {

            // Using this variable to count letters and determine if it's false.
            int countHowManyLetters = 0;

            // Inner loop.
            for (int j = 0; j < lowerCaseText.length(); j++)
                if (lowerCaseText.charAt(i) == lowerCaseText.charAt(j)) {
                    countHowManyLetters++;
                }
                // In this if statement it will return false if it's above two or below two.
                if (countHowManyLetters != 2) {
                    return false;
                }
        }
        return true;
    }
}

