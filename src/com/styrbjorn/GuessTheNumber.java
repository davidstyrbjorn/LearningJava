package com.styrbjorn;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    Scanner guessReader;
    Scanner stringReader;
    Random rand;

    public GuessTheNumber()
    {
        // For taking guess input in this->Run()
        guessReader = new Scanner(System.in);
        stringReader = new Scanner(System.in);
        // For generating the secret number
        rand = new Random();
    }

    private void postRun(boolean won)
    {
        // Check if won or lost
        if(won == true) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }

        // Check if play again
        System.out.println("Play again?");
        String playAgain = stringReader.nextLine();
        if(playAgain.equals("yes")) {
            run();
        }

        // Close Scanner, avoid resource leaks
        guessReader.close();
        stringReader.close();
    }

    public void run()
    {
        // Win/lose condition variables
        boolean won = false;
        int guessesLeft = 3;

        // The number to guess
        int secretNumber = rand.nextInt(10+1); // 0 - 10+1 (0 - inclusive & 10+1 - exclusive)!

        while(!won) {
            // Get the guess
            System.out.print("Enter your guess: ");
            int guess = guessReader.nextInt();

            // Check guess validation
            if (guess == secretNumber) {
                won = true;
            } else if (guess < secretNumber) {
                System.out.println("Your guess was a little low!");
            } else {
                System.out.println("Your guess was a little high");
            }

            // Decrement the guessesLeft
            guessesLeft--;
            if (guessesLeft == 0)
                break;
        }

        postRun(won);
    }

}
