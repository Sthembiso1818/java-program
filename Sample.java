import java.util.Scanner;

public class Sample {
	public static int even(num){
		return (num + num);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        String expression = "";

        System.out.println("Enter even numbers (0 to stop)");

        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num != 0) {
                if(num % 2 == 0) {
                    sum = sum + num;

                    if (expression.equals("")) {
                        expression = num + "";
                    } else {
                        expression = expression + " + " + num;
                    }
                } else {
                    System.out.println("Not an even number!");
                }
            }

        } while (num != 0);

        System.out.println(expression + " = " + sum);

        sc.close();
    }
}