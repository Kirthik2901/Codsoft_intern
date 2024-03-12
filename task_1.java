package com.codsoft;
import java.util.Scanner;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        int minimum = 1;
        int maximum = 100;
        int attempts = 5;

        Random rand = new Random();
        int secretNumber = rand.nextInt((maximum - minimum) + 1) + minimum;
        System.out.println("Welcome to Guess the Number Game!");
        System.out.printf("I have chosen a number between %d and %d. Can you guess what it is?\n", minimum, maximum);
        System.out.printf("You have %d attempts.", attempts);

        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Enter your number: ");
            int number = scanner.nextInt();

            if (number == secretNumber) {
                System.out.printf("Congrats !!! You've guessed it right !,", secretNumber, attempt);
                return;
            } else if (number < secretNumber) {
                System.out.println("your guess is low try again !.");
            } else {
                System.out.println("your guess is high. Go ahead ! just a little bit");
            }
        }

        System.out.printf("Sorry, you've run out of attempts. The correct number was " + secretNumber);
    }

    public static void mainGame(String[] args) {
        main (args);
    }
    }

