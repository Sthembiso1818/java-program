/*import java.util.Scanner;
public class VelaphiDeliveryApplication
{
	public static boolean validateDistance(double distanceDelivery)
    {
		
		if(distanceDelivery >= 3 && distanceDelivery<=100){
			return true;
		}
		else{
			return false;
		}
	    //return isValid;
	}
    public static double  calculateTotalCost(double deliveryDistance, double baseDistance, double baseCost)
    {
		double totalCost=0;
		
		if(deliveryDistance ==3){
			totalCost = baseCost * deliveryDistance; 
		}
		else if(deliveryDistance > 3){
			totalCost = ((deliveryDistance - baseDistance) * baseCost) * 2;
		}
	    return totalCost;
	}
	public static void displayDeliveryInformation(String refNum,double totalDelCost ){
		System.out.println("Delivery Note for Ref#: " + refNum );
		System.out.println("Total delivery cost: R" + totalDelCost);
	}
	public static void displayDeliverySummary(int delMade,int delNotMade){
		System.out.println("==========Delivery Summary============");
		System.out.println("Delivery made: " + delMade );
		System.out.println("Delivery not made: " + delNotMade );
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final double BASE_DISTANCE = 3.0; 
        final double BASE_COST = 5.00;
		String refNum="";
		int delMade=0,delNotMade=0;
		double distance;
		double totalDelCost=0;
		
		do{
			System.out.print("Enter delivery number or 0000 to exit: ");
			refNum = sc.nextLine();
			System.out.print("Enter the distance to the delivery location (in km): ");
			distance = sc.nextDouble();
			//sc.close();
			if(validateDistance(distance)){
				totalDelCost = calculateTotalCost(distance,BASE_DISTANCE, BASE_COST);
				delMade++;
			}
			else{
				System.out.println("Invalid distance,delivery distanve must be in the radius of 3 to 100km: ");
				delNotMade++;
			}
			
		}while(!refNum.equals("0000"));
		displayDeliverySummary(delMade,delNotMade);
	}
}*/
import java.util.Scanner;

public class VelaphiDeliveryApplication
{
    public static boolean validateDistance(double distanceDelivery)
    {
        if(distanceDelivery >= 3 && distanceDelivery <= 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double calculateTotalCost(double deliveryDistance, double baseDistance, double baseCost)
    {
        double totalCost = 0;

        if(deliveryDistance == baseDistance)
        {
            totalCost = baseCost;
        }
        else if(deliveryDistance > baseDistance)
        {
            totalCost = baseCost * ((deliveryDistance - baseDistance) * 2);
        }

        return totalCost;
    }

    public static void displayDeliveryInformation(String refNum, double totalDelCost)
    {
        System.out.println("\n========== Delivery Note ==========");
        System.out.println("Reference Number: " + refNum);
        System.out.printf("Total Delivery Cost: R%.2f%n", totalDelCost);
        System.out.println("===================================\n");
    }

    public static void displayDeliverySummary(int delMade, int delNotMade)
    {
        System.out.println("\n========== Delivery Summary ==========");
        System.out.println("Deliveries made: " + delMade);
        System.out.println("Deliveries not made: " + delNotMade);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        final double BASE_DISTANCE = 3.0;
        final double BASE_COST = 5.00;

        String refNum;
        double distance;
        double totalDelCost;

        int delMade = 0;
        int delNotMade = 0;

        do
        {
            System.out.print("Enter reference number or 0000 to exit: ");
            refNum = sc.nextLine();

            if(refNum.equals("0000"))
            {
                break;
            }

            System.out.print("Enter the distance to the delivery location (in km): ");
            distance = sc.nextDouble();
            sc.nextLine();

            if(validateDistance(distance))
            {
                totalDelCost = calculateTotalCost(distance, BASE_DISTANCE, BASE_COST);

                displayDeliveryInformation(refNum, totalDelCost);

                delMade++;
            }
            else
            {
                System.out.println("Invalid distance. Delivery distance must be between 3 km and 100 km.");

                delNotMade++;
            }

        }while(true);

        displayDeliverySummary(delMade, delNotMade);

        sc.close();
    }
}
	
	