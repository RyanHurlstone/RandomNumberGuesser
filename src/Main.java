/**
 * This is a small game where you have to guess the random number chosen by the computer!
 * @author Ryan Hurlstone
 * @version 1.0
 *
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int computerNumberChoice = (int) (Math.random() * 11); // Chooses a number between 0 and 1
        int userNumberChoice = -1; // Start with a negative number that won't match

        System.out.println("========================================");
        System.out.println("= Welcome to the number guessing game! =");
        System.out.println("= This was created by Ryan Hurlstone ! =");
        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in); // Initialises a scanner


        // Loop until the user gets the answer correct
        while (userNumberChoice != computerNumberChoice) {
            System.out.println("Enter your guess (0 - 10): ");
            userNumberChoice = scanner.nextInt(); // Read the users input and set it to userNumberChoice variable

            if (userNumberChoice == computerNumberChoice) { // If the users number is the same as the computers print out they guessed it correctly
                System.out.println("You guessed the number correctly! Well done!");
            } else if (userNumberChoice > computerNumberChoice) { // If the users number is higher than the computers print out they guessed too high
                System.out.println("Your guess is too high!");
            } else { // If the users number does not equal the computers number  && is not higher, it must be lower
                System.out.println("Your guess is too low!");
            }
        }

        System.out.println("Closing scanner...");
        try {
            Thread.sleep(1000); // ms delay
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle error (or ignore if you want)
        }
        scanner.close(); // Close the scanner
        System.out.println("Scanner sucessfully closed");
        System.out.println(""); // Creates a break / gap
        System.out.println("Thanks for playing, have a nice day!");


    }
}