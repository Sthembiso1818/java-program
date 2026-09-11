import java.util.Scanner;
public class  Sentence
{
	public static int  letters(String sentence){
		int num = sentence.length()
		return num;
	}
	public static int uppercase(String sentence){
		int number = 0;
		for(int i =0;sentence.length();i++){
			char ch = sentence.charAt(i);
			number++;
		}
		return number; 
	}
	public static int lowercase(String sentence){
		int no;
		for(int i=0;sentence.length();i++){
			char c=sentence.charAt(i);
			no++;
		}
		return no;
	}
	public static boolean digits(String sentence){
		for(int i;sentence.length();i++){
			if(Character.isDigit(sentence)){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public static 