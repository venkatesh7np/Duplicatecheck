import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;

    public class  RandomNumber
    {
        public static void main(String[] args)
        {
            Random rand = new Random();
            int numTogGuess = rand.nextInt(100);
            int numOfTries = 0;
            Scanner input = new Scanner(System.in);
            int guess;
            boolean win = false;

            while (win == false)
            {
                System.out.println("Guess the number between 1-100:");
                guess = input.nextInt();
                numOfTries++;

                if (guess == numTogGuess)
                {
                    win = true;
                }
                else if (guess < numTogGuess)
                {
                    System.out.println("your guess is too low");
                }
                else if (guess > numTogGuess)
                {
                    System.out.println("your guess is too high");
                }
            }
            System.out.println("you win");
            System.out.println("the number was" + " " + numTogGuess);
            System.out.println("you take" + " " + numOfTries + " tries to guess");
        }
    }