import java.text.DecimalFormat;
import java.util.Scanner;
public class Sales
{
	public static double calculateCommission(double sales){
		double totalSales=0;
		for(int i=0;i<10;i++){
			if(sales<20000.00){
				totalSales = sales * 0.03;
			}
			else if(sales>=20000.00 && sales <50000.00){
				totalSales = sales*0.05;
			}
			else if(sales>=50000.00){
				totalSales = sales*0.09;
			}
		}
		return totalSales;
	}
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		String[] names = {"James Boyd","Mpho Baloyi",
		                 "Timothy Ryan","Daniel Ramogolo","William Seimela",
						 "Harold Xaba","Miller Bentley","Sam Sithole","Richard Frey",
						 "Peter sebata"};
		double[] totalSale = {40000.00,54321.00,12345.60,
		                      60444.40,23457.80,43222.30,12444.00,
		                      12444.00,23555.00,45666.00,18982.30};
							
		double[] commission = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            double commissionAmount = calculateCommission(totalSale[i]);
            if (commissionAmount > 0) {  
                commission[i] += commissionAmount;
            }
        }		
		
		System.out.println("=================================Before Sorting========================");
		System.out.println("Sales person\t\t\tTotal Sales\t\tCommission");
		System.out.println("=======================================================================");
		for(int a=0;a<names.length;a++){
			System.out.print(names[a] +"\t\t\t");
			System.out.print(totalSale[a] + "\t\t\t");
			System.out.print(df.format(commission[a]));
			
			System.out.println();
		}
	    for(int i = 0; i < names.length - 1; i++){
            for(int j = 1; j < names.length - i; j++){

                if(totalSale[j - 1] > totalSale[j]){

                    // Swap sales
                    double tempSale = totalSale[j - 1];
                    totalSale[j - 1] = totalSale[j];
                    totalSale[j] = tempSale;

                    // Swap names
                    String tempName = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = tempName;

                   // Swap commission
                   double tempCommission = commission[j - 1];
                   commission[j - 1] = commission[j];
                   commission[j] = tempCommission;
                }
            }
        }
		System.out.println();
		System.out.println("=================================After Sorting=========================");
		System.out.println("Sales person\t\t\tTotal Sales\t\tCommission");
		System.out.println("=======================================================================");
		
		for(int b=0;b<names.length;b++){
			System.out.print(names[b] +"\t\t\t");
			System.out.print(totalSale[b] + "\t\t\t");
			System.out.print(df.format(commission[b]));
			
			System.out.println();
		}
	}
}