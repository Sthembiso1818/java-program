import java.util.Scanner;
public class Positive
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		System.out.print("Enter first number: ");
		num1 = kb.nextInt();
		System.out.print("Enter second number: ");
		num2 = kb.nextInt();
		
		int result = sum(num1,num2);
		
		
		System.out.println(result);
	}
	public static int sum(int a,int b){
		return a + b ;
	}
}	