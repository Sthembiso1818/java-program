import java.util.Scanner;
public class Task4
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		int Num;
		
		System.out.print("Enter 3 digits: ");
		Num = kb.nextInt();
		
		if(Num == 123){
			System.out.print("Palindrome");
		}
	}
}