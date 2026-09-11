import java.util.Scanner;
public class Task7
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		String AllNum =" ";
		int num=0;
		int count=0;
		int sum=0;
		
		System.out.print("Enter any number or PRESS 0 to end  ");
		num =kb.nextInt();
		
		while(num!=0)
		{
			System.out.print("Enter any number: ");
			num =kb.nextInt();
			
			if(count > 0)
			{
				AllNum +=" + ";
			}
			
			sum +=num;
			AllNum +=num;
			count++;
		}
	    System.out.println(AllNum + " = " + sum);
	
	}
}	
		