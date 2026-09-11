import java.util.Scanner;
public class Manipulation 
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String text;
		String newText="";
		int Length=0;
		
		System.out.print("Enter your string here: ");
		text = sc.nextLine();
		
		Length = text.length();
		
		for(int i=0;i<text.length();i++){
			char ch = text.charAt(i);
			
			if((i+1)%5==0){
				newText = newText + '*';
			}
			else{
				newText = newText + ch;
			}
		}
		System.out.println("Length of this string: " + Length);
		System.out.println(newText.toUpperCase());
	}
}