import java.util.Scanner;

public class Tutorials
{
    // Static variable
    public static final double RATE = 355.50;

    // Method to check if the student qualifies
    public static boolean qualify(int ppa, int coh, int cfa)
    {
        if (ppa >= 60 && (coh >= 60 || cfa >= 50))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Method to calculate tutorial fee
    public static double calcTutFee(int sessions)
    {
        if (sessions >= 2 && sessions <= 8)
        {
            return sessions * RATE;
        }
        else
        {
            return 0;
        }
    }

    // Method to display the fee
    public static void displayFee(double fee)
    {
        System.out.printf("Tutorial fee: R%.2f%n", fee);
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int progr1, compFund, compMath, noSession;
        double payment;

        System.out.print("Enter PPA115D marks: ");
        progr1 = input.nextInt();

        System.out.print("Enter COH115D marks: ");
        compMath = input.nextInt();

        System.out.print("Enter CFA115D marks: ");
        compFund = input.nextInt();

        // Check qualification
        if (qualify(progr1, compMath, compFund))
        {
            System.out.print("Enter number of sessions (2-8): ");
            noSession = input.nextInt();

            payment = calcTutFee(noSession);

            if (payment != 0)
            {
                displayFee(payment);
            }
            else
            {
                System.out.println("Error: Invalid number of sessions.");
            }
        }
        else
        {
            System.out.println("Sorry, you do not qualify to be a student assistant.");
        }

        input.close();
    }
}