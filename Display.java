public class Display
{
	public static void main(String[] args)
	{
		int[] result ={50,30,50,85,90};
		
		int highest = result[0];
		int n =result.length;
		System.out.print("Unsorted: ");
		for(int z=0;z<n;z++){
			System.out.print(result[z] + " ");
		}
		System.out.println();
		
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(result[j-1]>result[j]){
					int prevNum=result[j];
					result[j]=result[j-1];
					result[j-1]=prevNum;
				}
			}
		}
		System.out.print("Sorted: ");
		for(int a=0;a<n;a++){
			System.out.print(result[a] + " ");
		}
		System.out.println();
		for(int i=0;i<n;i++){
			if(result[i]>highest){
				highest=result[i];
			}
		}
		System.out.println("The highest number: " + highest);
	}
}