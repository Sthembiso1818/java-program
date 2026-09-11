public class Sorted 
{
	public static void main(String[] args)
	{
		int[] arr ={8,3,9,1,4,0,10,5};
		
		int Length = arr.length;
		
		for(int z=0;z<Length;z++){
			System.out.print(arr[z] + " ");
		}
		System.out.println();
		
		
		for(int i=0;i<Length;i++){
			for(int a=1;a<Length-i;a++){
				if(arr[a-1]>arr[a]){
					int prev=arr[a];
					arr[a]=arr[a-1];
					arr[a-1]=prev;
				}
			}
		}
		for(int j=0;j<Length;j++){
			System.out.print(arr[j] + " ");
		}
	}
}