import java.util.Scanner;
public class StringManipulation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String sentence;
		String prevSentence="";
		String newSentence;
		int length;
		
		System.out.print("Enter a sentence: ");
		sentence = sc.nextLine();
		
		length = sentence.length();
		
		for(int i=0;i<sentence.length();i++){
			char ch = sentence.charAt(i);
			
			if(i==0){
				ch=Character.toUpperCase(ch);
			}
			else{
				char prevCh=sentence.charAt(i-1);
				
				if(prevCh==' ' && Character.isLetter(ch)){
					ch =Character.toUpperCase(ch);
				}
			}
			prevSentence += ch;
		}
		newSentence = prevSentence.replace(' ','-');
		
		System.out.println("==RESULT==");
		System.out.println("Original String in UPPERCASE: " + sentence.toUpperCase());
        System.out.println("Capitalized with Dash: " + newSentence);
        System.out.println("Length of the String: " + length);		
	}
}