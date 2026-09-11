import java.util.Scanner;
public class Population
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] result = new int[5];
		
		for(int i=0;i<result.length;i++){
			System.out.print("Enter marks obtain for student " + (i+1) +":" );
			result[i] = sc.nextInt();
			if(result[i]<0 || result[i]>100){
				System.out.println("The quiz must not below zero or even a mark above 100");
			}
		}
		for(int i=0;i<result.length;i++){
			System.out.println("Student " + (i + 1) + ": " + result[i]);
		}
	
	}
}