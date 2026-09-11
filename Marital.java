import java.util.Scanner;
public class Marital
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char[] ch = new char[10];
		int countSingle=0;
		int countDivorcee=0;
		int countMarried=0;
		
		for(int i=0;i<10;i++){
			System.out.print("Enter marital status of person " + (i+1) + ": ");
			ch[i]=sc.next().charAt(0);
			if(ch[i]=='M' || ch[i]=='m'){
				countMarried++;
			}
			else if(ch[i]=='S' || ch[i]=='s'){
				countSingle++;
			}
			else if(ch[i]=='D' || ch[i]=='d'){
				countDivorcee++;
			}
			if(ch[i]!='M'&& ch[i]!='S'&& ch[i]!='D'&&ch[i]!='m'&&ch[i]!='d'&&ch[i]!='s'){
				System.out.println("Invalid status letter : please re-enter marital status: ");
				ch[i] = sc.next().charAt(0);
			}
		}
		System.out.println("The number of single people: " + countSingle);
		System.out.println("The number of married people: " + countMarried);
		System.out.println("The number of divorcees: " + countDivorcee);
	}
}