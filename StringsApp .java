import java.util.Scanner;
public class StringsApp 
{
	public static String change(String sentence){
		String st;
		
		st = sentence.replace('a','x');
		return st;
	}
	public static void display(String name){
		System.out.println(name);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String name,result;
        
        System.out.print("Enter any sentence: ");
        name sc.nextLine();
       
        while(name!='z'){
			result = change(name);
			
			System.out.print("Enter any sentence: ");
            name sc.nextLine();
		}
        display(name);		
	}
}