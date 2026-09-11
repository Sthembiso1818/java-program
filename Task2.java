import java.util.Scanner;
public class Task2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		char Gender;
		
		System.out.print("Enter a charecter: ");
		Gender = kb.next().toUpperCase().charAt(0);
		
		if(Gender == 'F'){
			System.out.print("Your are Female");
		}
	}
}