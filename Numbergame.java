import java.util.Scanner;
import java.util.Random;

class Demo 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 10;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it!");

        while (attempts < maxAttempts) 
		{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) 
			{
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) 
			{
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        if (attempts == maxAttempts) 
		{
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}