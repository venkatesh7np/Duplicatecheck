package RandomNumber1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class  Randomnumber implements Guessing
    {
        Random rand = new Random();
        int num_To_be_Guessed = rand.nextInt(100);
        int numOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        public void GameLogic()
        {
        boolean win = false;

        while (win == false)
        {
            System.out.println("Guess the number between 1-100:");
            guess = input.nextInt();
            numOfTries++;

            if (guess == num_To_be_Guessed)
            {
                win = true;
            }
            else if (guess < num_To_be_Guessed)
            {
                System.out.println("Too low, Try Again");
            }
            else if (guess > num_To_be_Guessed)
            {
                System.out.println("Too high, Try Again");
            }
        }
        System.out.println("you won");
        System.out.println(" Number guessed is" + " " + num_To_be_Guessed);
        System.out.println("you took " + " " + numOfTries + " tries to guess");
    }
        public void StoringResult() {
            try {
                FileWriter GameResult = new FileWriter("D:\\Atmecs\\Assignments\\NumberResult.txt");
                if (guess == num_To_be_Guessed) {
                    GameResult.write("you won, ");
                    GameResult.write(" Number guessed is :"+" "+num_To_be_Guessed );
                    GameResult.write(" , you took" + " " + numOfTries + " " + " tries to guess the number");

                }
                GameResult.close();
            } catch (IOException e) {
                System.out.println("Error Occured");
                e.printStackTrace();
            }
        }
    }