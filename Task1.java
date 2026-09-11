public class Task1
{
	public static void main(String[] args)
	{
		int[] result ={50,30,50,85,90};
		double average=0;
		int sum=0;
		int size;
	    int min=result[0];
		int max=result[0];
		
		size = result.length;
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
			
			sum +=result[i];
		}
		for(int z=1;z<size;z++){
			if(result[z]>max){
				max = result[z];
			}
			if(result[z]<min){
				min = result[z];
			}
		}
		average =(sum/size);
		System.out.println("The sum is: " + sum + "\nThe average is: " + average);
		System.out.println("\nMaximum number is: " + max);
        System.out.println("Minimum number is: " + min);
	}
}