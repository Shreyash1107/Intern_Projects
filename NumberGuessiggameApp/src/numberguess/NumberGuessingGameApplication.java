package numberguess;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGameApplication
{
	public static void main(String args[])
	{
		Scanner xyz = new Scanner(System.in);
			Random rand = new Random();   //Created a Random Number Generator
			int guessednum;  //55
			guessednum = rand.nextInt(100) + 1;  //Actually Gueesed Number is Stored here
			boolean result = false;
			int attempts = 0;//65
			int guess;  //Here user will enter number he guess
						System.out.println("****************Welcome to Number Guessing Game*************");
						System.out.println(" ");
						while(!result)
						{
							System.out.println("Enter your guess:");
							guess = xyz.nextInt();
							attempts++;
							if(guess<1  || guess>100)
							{
								System.out.println("Invalid Input, Please Enter the Guess within 1 to 100");
							}
							else if(guess<guessednum) //25 <55
							{
								System.out.println("Your Guesss is too low, Please increase you guess");
							}
							else if(guess>guessednum)  //75>55
							{
								System.out.println("Guess is too high, Please reenter your guess");
							}
							else
							{
								result = true;
								System.out.println("Congrarulrations! You have Guessed the Correct Number.");
								System.out.println(" ");
								System.out.println(" You have taken " + attempts + " attempts to Guess the Correct Number");
								System.out.println(" ");
								System.out.println("Guessed Number is " + guessednum);
							}
						}
	}
}