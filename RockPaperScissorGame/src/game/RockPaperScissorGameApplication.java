package game;
import java.util.*;
import java.util.Random;
public class RockPaperScissorGameApplication
{
	public static void main(String args[])
	{
		Scanner abc = new Scanner(System.in);
		Random rand = new Random();
		String str[] = {"Rock","Paper","Scissor"};
		String usermove,computermove;
		boolean result = true;
		System.out.println("*******************Welcome to the Rock,Paper,Scissor Game*******************");
		while(result)
		{
			computermove = str[rand.nextInt(3)];  //generates a random integer within 0,1 and 2
			System.out.println("Please Enter you Move(Rock,Paper,Scissor), if you want to exit Please Enter Exit:");
			usermove = abc.nextLine();
			if(usermove.equalsIgnoreCase("Exit"))
			{
				result = false;
				break;
			}
			if(!usermove.equalsIgnoreCase("Rock") && !usermove.equalsIgnoreCase("Paper") && !usermove.equalsIgnoreCase("Scissor"))
			{
				System.out.println("You have Provided an Invaid Move, Please try once again");
				continue;
			}
			System.out.println("Compuetr's Move: " + computermove);
			if(usermove.equalsIgnoreCase(computermove))
			{
				System.out.println("It's a Tie");
			}
			else if(usermove.equalsIgnoreCase("Rock") && usermove.equalsIgnoreCase("Scissor") 
					|| usermove.equalsIgnoreCase("Paper") && usermove.equalsIgnoreCase("Rock")
					|| usermove.equalsIgnoreCase("Scissor") && usermove.equalsIgnoreCase("Paper"))
			{
				System.out.println("Congratulations! You have won tha game");
			}
			else
			{
				System.out.println("You Lose the Game, Better Luck Next Time!");
			}
		}
		System.out.println("***************Thank you for Playing Rock,Paper,Scissor Game*************");
	}
}