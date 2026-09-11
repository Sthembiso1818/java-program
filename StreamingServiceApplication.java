import java.util.Random;
import java.util.Scanner;
public class  StreamingServiceApplication
{
	public static void populateSubscribers(int[] suscribers){
		Random arr = new Random();
		for(int i=0;i<6;i++){
			suscribers[i] = arr.nextInt(400001)+100000;
		}
	}
	public static void populateRatings(int[] ratings,String[] service){
		for(int i=0;i<6;i++){
			System.out.print("Enter the service provider: ");
			service[i]=sc.nextLine();
			
			System.out.print("Enter user ratings(1-5) for " + service[i] + ": ");
			ratings[i]= sc.nextInt();

		}
	}
	public static int mostWatchedService(int[] suscribers){
		int highest =[0];
		for(int i=0;i<6;i++){
			if(suscribers[i]>highest){
				highest=suscribers[i];
			}
		}
		return suscribers;
	}
	public static void sortServiceProvider(String[] service,String[] country,int[] number,int[] ratings){
		for(int i=0;i<6;i++){
			for(int j=1;j<6-i;j++){
			    if(service[j].compareTo(service[j-1])>0{
					String temp = service[j];
					service[j] = service[j-1];
					service[j-1] = temp;
				}
			}
		}
	}
	public static void diplayDetails(String[] provider,String[] origin,int[] suscribers,int[] ratings){
		for(int i=0;i<6;i++){
			System.out.print(provider[i] + "\t\t\t");
			System.out.print(origin[i] + "\t\t");
			System.out.print(suscribers[i] + "\t\t");
			System.out.print(ratings[i]+ "\t\t");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] serviceProviders = {"Youtube","Netflix","DSTV","Showmax","PrimeTv","SABC+"}
		String[] originCountry ={"United States","United States","South Africa","South Africa","United States","South Africa"};
		
		int[] suscribers = new int[6];
		int[] userRatings = new int[6];
		
		for(int i=0;i<serviceProviders.length;i++){
			
		}
	}
}