import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int num;
        int sum = 0;          // running total, initialised to 0
		int count=0;
		String expression = " ";
        
        System.out.println("Enter numbers to sum (enter 0 to finish):");
        
        while (true) {
            System.out.print("Enter any number: ");
            num = kb.nextInt();
            
            if (num == 0) {
                break;        // exit loop when 0 is entered
            }
             if (count > 0) {
                expression += " + ";
            }
            sum += num;       // add the number to the running total
			expression += num;
			count++; 
        }
        
        System.out.println(expression + " = " + sum);
        kb.close();
    }
}