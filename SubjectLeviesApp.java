import java.util.Scanner;
public class SubjectLeviesApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String [5];
		int[][] marks = new int[5][2];
		
		for(int i=0;i<name.length;i++){
			System.out.print("Enter the name of learner" + (i+1) + ": ");
			name[i]=sc.nextLine();
			
			System.out.print("Enter marks for test 1: ");
			marks[i][0] = sc.nextInt();
			
			System.out.print("Enter marks for test 2: ");
			marks[i][1] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("\n===== STUDENT RESULTS =====");
        System.out.println("Name\t\tTest1\tTest2");
        System.out.println("----------------------------------------");
		
		for(int a=0;a<name.length;a++){
			System.out.print(name[a] + "\t\t");
            System.out.print(marks[a][0] + "\t");
            System.out.print(marks[a][1] + "\t");
			
			System.out.println();
		}
        
	}
}