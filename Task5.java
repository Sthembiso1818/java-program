import java.util.Scanner;
public class Task5
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		int Age;
		double Weight, Height;
		
		System.out.print("Please enter your age: ");
		Age = kb.nextInt();
		System.out.print("Please enter your weight: ");
		Weight = kb.nextDouble();
		System.out.print("Please enter your height: ");
		Height = kb.nextDouble();
		
		if((Age>=10) && (Age<=15)){
			if((Weight>=25) && (Weight<=45)){
				if((Height>=1) && (Height<=1.5)){
					System.out.print("You qualify to be the part of the team");
				}else{
					System.out.print("You dont qualify because of HEIGHT");
				}
			}else{
				System.out.print("You dont qualify because of WEIGHT");
			}
		}else{
			System.out.print("You dont qualify because of AGE");
		}
	}
}