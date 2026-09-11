import java.util.Scanner;
public class StringPattern 
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input="",modified="";
		int numOfUpLetters=0;
		int numOfLowLettes=0;
		int spaceCount=0;
		int specialCount=0;
		
		System.out.print("Enter a string to analyze: "); 
        input = sc.nextLine();
        modified=input;		
		
		for(int i=0;i<input.length();i++){
			char ch =input.charAt(i);
			if(Character.isUpperCase(ch)){
				numOfUpLetters++;
			}
			if(Character.isLowerCase(ch)){
				numOfLowLettes++;
			}
			if(Character.isWhitespace(ch)){
				spaceCount++;
			}
			if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
				specialCount++;
		    }
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				modified = modified.replace(ch,'*');
			}
			
		}
		System.out.println("Uppercase letters: " + numOfUpLetters); 
        System.out.println("Lowercase letters: " + numOfLowLettes); 
        System.out.println("Spaces: " + spaceCount); 
        System.out.println("Special characters: " + specialCount); 
        System.out.println("Modified String (vowels replaced): " + modified);
	}
}