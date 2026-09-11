import java.util.Scanner;
//import java.text.DecimalFormat;
public class  FuneralCoverApp
{
	public static boolean isEligible(int age, double monthlyAllowence){
		if(age>=18 && monthlyAllowence >=500){
			return true;
		}
		else{
			return false;
		}
	}
	public static double getBasePremium(char ch){
		static final double BASIC=80.0;
		static final double STANDARD=120.0;
		static final double EXTENDED=180.0;
		double result;
		switch(ch){
			case 'A':result=BASIC;break;
			case 'B':result=STANDARD;break;
			case 'C':result=EXTENDED;break;
		}
		return result;
	}
	public static double calculatePremium(double basePremium,int numOfDep,int ageOfMember){
		double finalAmount;
		
		if(ageOfMember >=65){
			finalAmount = 40 * numOfDep;
		}
		else{
			finalAmount = 25 * numOfDep;
		}
		return finalAmount + basePremium;
	}
	public static double getPayOut(char a){
		final static int BASIC =10000;
	    final static int STANDARD =20000;
		final static int EXTENDERD=30000;
		double amount;
		
		switch(a){
		    case 'A':amount=BASIC;break;
			case 'B':amount=STANDARD;break;
			case 'C':amount=EXTENDED;break;
		}
		return amount;
	}
	public static void dispalyCoverDetails(String name,int age,double allowance,String status,char b,double calPremium,double b){
		System.out.println("---Membership Summary---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + "|" + "Monthly Allowance: " + allowance + "Working: " + status );
		System.out.println("Monthly Premium: " + calPremium);
		System.out.println("Cover Payout: " + a);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String name,status;
		int age,numOfDependent,total;
		double allowance,answer,calPremium;
		char b;

		System.out.println("===Hluma Funeral Cover Application===");
		System.out.print("Enter maember name: ");
		name = input.nextLine();
			
		System.out.print("Enter age: ");
		age = input.nextInt();
		System.out.print("Enter monthly Allowence (R): ");
		allowance = input.nextDouble();
		
		if(isEligible(age,allowance)){
	
			System.out.print("Are you currently working: ");
			status = input.nextLine();
			System.out.print("Enter number of dependend: ");
			numOfDependent = input.nextInt();
			
			System.out.print("Choose plan A=Basic, B=Standard, C=Extended: ");
			b = input.charAt(0);
			
			answer = getBasePremium(b);
			calPremium = calculatePremium(getBasePremium(b),age,numOfDependent); 
			total =getPayOut(b);
			dispalyCoverDetails(name,age);
		}
		else{
			System.out.println("Sorry " + name + " you do not qualify for funeral cover.");
			System.out.println("Requirements: Age must be 18 or above AND monthly allowance must be more than R500");
		}
		
	}
}