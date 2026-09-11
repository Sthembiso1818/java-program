import java.util.Random;
import java.util.Scanner;
public class Task3
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random randomiser = new Random();
		
		int Num, Ans;
		 
		
		Num = randomiser.nextInt(2)+1;
		
		System.out.print("Guess a number: ");
		Ans = kb.nextInt();
		
		if(Ans == Num){
			System.out.print("You've won: ");
		}
	}
}