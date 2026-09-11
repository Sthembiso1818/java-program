import java.util.Scanner;

public class AtleticsTeamApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 10 students, 2 tests each
        String[] names = new String[10];
        int[][] marks = new int[10][2];  // 10 rows, 2 columns
        double[] averages = new double[10];
        
        // INPUT: Get names and marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            
            System.out.print("Enter mark for Test 1: ");
            marks[i][0] = input.nextInt();
            
            System.out.print("Enter mark for Test 2: ");
            marks[i][1] = input.nextInt();
            input.nextLine(); // Clear the buffer
            
            // Calculate average
            averages[i] = (marks[i][0] + marks[i][1]) / 2.0;
            
            System.out.println();
        }
        
        // OUTPUT: Show everything
        System.out.println("\n===== STUDENT RESULTS =====");
        System.out.println("Name\t\tTest1\tTest2\tAverage");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(names[i] + "\t\t");
            System.out.print(marks[i][0] + "\t");
            System.out.print(marks[i][1] + "\t");
            System.out.println(averages[i]);
        }
    }
}