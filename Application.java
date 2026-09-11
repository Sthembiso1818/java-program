import java.util.Scanner;
public class Application 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String phrase,newPhrase="";
		int phraseLength;
		
		System.out.println("===Acronym Generator===");
		System.out.print("Enter a phrase: ");
		phrase = sc.nextLine();
		
		phraseLength =phrase.length();
		
		for(int i=0;i<phrase.length();i++){
			char ch = phrase.charAt(i);
			if(i==0){
				newPhrase+=Character.toUpperCase(ch);
			}
			else{
				char ch1 = phrase.charAt(i-1);
				if(Character.isWhitespace(ch1)){
					ch = Character.toUpperCase(ch);
					newPhrase+=ch;
				}
			}
				
			
		}
		System.out.println("\n\nThe acronym for " + '"'+ phrase.toUpperCase()+'"'+ " is :" + newPhrase);
		System.out.println("The phrase is " + phraseLength + " character long");
        		
	}
}