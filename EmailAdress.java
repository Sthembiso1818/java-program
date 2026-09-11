import java.util.Scanner;
public class EmailAdress
{
	public static String getNumbers(String input){
	    String output="";
		for(int i =0;i<input.length();i++){
			char ch = input.charAt(i);
			if(Character.isDigit(ch)){
				output +=ch;
			}
		}
		return output;
	}
	public static void displayEmailAddress(String Output,String Email){
		System.out.println("Extracted numeric substring: " + getNumbers(Output));
		System.out.println("Email address: " +getNumbers(Output)+ Email);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String contacts;
		String email;
		String newString;
		
		System.out.print("Entr your contact details here: ");
		contacts = sc.nextLine();
		System.out.print("Enter email address: ");
		email = sc.nextLine();
		
		newString = getNumbers(contacts);
		displayEmailAddress(newString,email);
	}
}