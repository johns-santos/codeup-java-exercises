/*
Number Guessing Game.
 */

import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static void main(String[] args) {

        Random rand = new Random(); // Generate a random number
        int numToGuess = rand.nextInt(100); // Set upper bound for random num generator
        int numberOfTries = 0; // User guess attempts
        Scanner scan = new Scanner(System.in);
        int userGuess; // initialize user guess
        boolean win = false;

        // Set condition for WHILE-loop
    while (win == false) {

        System.out.println("Guess a number between 1 and 100: ! ");
        userGuess = scan.nextInt();
        numberOfTries++;

        //======================================================
        if (userGuess == numToGuess) {
            win = true;
        }
        else if (userGuess < numToGuess) {
            System.out.println(" HIGHER!!!!");
        }
        else if (userGuess > numToGuess) {
            System.out.println(" LOWER!!!!!! ");
        }
        //======================================================
    }

        System.out.println("Good Guess!!!! ");
        System.out.println("The number was " + numToGuess +".");
        System.out.println("It took you " + numberOfTries + ".");

    }
}


