import java.yutil.Scanner;
public class HomeLoanCalculator
{
	public static double  calculateMonthlyPaymnet (double P,double r,int n){
		double A;
		
		A = P * r*math.pow(1+r,n)/math.pow(1+r,n);
		
		return A;
	}
	public static boolean  checkLoanQualify(int credScore,int minScore,double minDeposit){
		double perc = minDeposit * 0.2; 
		if((credScore >= minScore) && (minDeposit > perc)){
			return true;
		}
        else{
			return false;
		}		
	}
	public static void displayMonthlyPaymnet(double calculateMonthlyPaymnet(A),int displayMonthlyPaymnet(n)){
		System.out.print("Monthly payment: R" + A + n );
	}
	public static void displayQualification(boolean checkLoanQualify()) 