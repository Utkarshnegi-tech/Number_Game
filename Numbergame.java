import java.util.Random;
import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lowerBound = 1;
        int upperBound = 100;   
        int secretNumber = generateRandomNumber(lowerBound, upperBound);
        
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the game");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess > secretNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);
        
        scanner.close();
    }
    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
