/**
 * This is a simple Java class.
 * @author Ryan Hurlstone
 * @version 1.0
 *
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int computerNumberChoice = (int) (Math.random() * 11); // Chooses a number between 0 and 1
        //
        System.out.println("========================================");
        System.out.println("= Welcome to the number guessing game! =");
        System.out.println("= This was created by Ryan Hurlstone ! =");
        System.out.println("========================================");

        System.out.println("Enter a number between 0 and 10: "); // Asks user to enter a number between 0 & 10 to guess what the computer has picked
        Scanner scanner = new Scanner(System.in); // Initialises a scanner
        int userNumberChoice = scanner.nextInt(); // Creates a new variable for the users input and uses the scanner to scan and read what the user has input
        scanner.close(); // Close the scanner so we don't lose the data

        System.out.println("Your number choice is: " + userNumberChoice); // Print the users number choice they entered
            if (userNumberChoice == computerNumberChoice) { // If the users number is the same as the computers print out they guessed it correctly
                System.out.println("You guessed the number correctly!");
            } else if (userNumberChoice > computerNumberChoice) { // If the users number is higher than the computers print out they guessed too high
                System.out.println("Your guess is too high!");
            } else { // If the users number does not equal the computers number  && is not higher, it must be lower
                System.out.println("Your guess is too low!");
        }
    }
}