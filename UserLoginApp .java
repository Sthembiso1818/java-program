import java.util.Scanner;
public class UserLoginApp 
{
	public static boolean  isValidFormat(String password{
		for(int i=0;password.length();i++){
			if(password.charAt(i)=='#'){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public static String extractUsername(String password){
		int result;
		String name;
		
		result = password.indexOf('#');
		name = password.substring(result);
		
        return name;		
	}
	public static String extractPassword(String password){
		int after;
		String output;
		
		after = password.indexOf('#');
		output = password.substring(after,-1);
		return output;
	}
	public static int countLetters(String password){
		int num;
		
		num = extractUsername(password).length();
	}
    public static boolean checkPasswordStrength(String password){
		for(int=0;password.length();i++){
			if(Character.isDigit(password)) && (Character.toUpperCase(password)){
				return true;
			}
			else{
				return false;
			}
		}
	}
    public static String getFirstPart(String password){
		String out;
		
		if(extractPassword(password).length<4){
			out = extractPassword(password);
		}
		else{
			out = extractPassword(password).substring(5);
		}
	}	return out;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String userName,word,strength;
		int total;
		
		System.out.print("Enter username#pasword: ");
		userName = sc.nextLine();
		
		total = countLetters(userName);
		if(!(isValidFormat(userName))){
			System.out.println("Invalid Format!");
		}
		else{
			System.out.println("USERNAME (UPPERCASE): " + extractUsername(userName).toUpperCase);
			System.out.println("Username letters: " + total);
		}
		if(checkPasswordStrength(userName){
			System.out.println("password strength:  STRONG")
		}
		else{
			System.out.println("password strength: WEAK");
		}
	}
}