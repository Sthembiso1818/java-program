import java.util.Scanner;
public class LibraryCatalog 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[][] Author = new String [5][3];
		
		for(int i=0;i<Author.length;i++){
			System.out.println("Enter information for book " + (i+1) );
			
			System.out.print("Title: ");
			Author[i][0]=sc.nextLine();
			
			System.out.print("Author: ");
			Author[i][1]=sc.nextLine();
			
			System.out.print("Availaility: ");
			Author[i][2]=sc.nextLine();
		}
		
		System.out.println("\t\t\t\tBook Catalog");
		System.out.println("\t\t\t=============");
		System.out.println("Title\t\t\t\tAuthor\t\t\t\tAvalability");
		System.out.println("====\t\t====\t\t====");
		for(int j=0;j<Author.length;j++){
			System.out.print(Author[j][0] + "\t\t\t\t"); 
			System.out.print(Author[j][1] + "\t\t\t\t");
			System.out.print(Author[j][2]);
			
			System.out.println();
		}
		
		System.out.print("Enter a book for search: ");
		String search = sc.nextLIne();
		
		for(int a=0;a<Author.length;a++){
			if(Author[a].equalsIgnoreCase(search)){
				System.out.print("Book found");
			}
			else{
				System.out.print("Book not found");
			}
		}
	}
}