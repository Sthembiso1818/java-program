import java.util.Scanner;
public class Weight
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		final double AVERAGE = 3.5;
		double weight,totalLoss=0;
		int count=0;
		
		System.out.println("******Weight Loss Monitoring********\n\n");
		
		for(int i=1;i<=6;i++){
			System.out.print("Enter your loss for month " + i + " in kg: ");
			weight = kb.nextDouble();
			if(weight > AVERAGE){
				System.out.println("Your weight loss is above average this month");
				count++;
			}
			totalLoss += weight;
		}
		System.out.println("Your total weight loss in 6 months: " + totalLoss + " kg");
		System.out.println("In " + count + " month(s) you lost more than average weight");
	}
	
}