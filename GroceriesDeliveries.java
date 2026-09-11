
public class GroceriesDeliveries
{
	public static char populateGrades(int[] marks){
		char ch;
		if(marks >=90){
			ch='A';
		}
		else if(marks>=80 && marks <=89){
			ch='B';
		}
		else if(marks>=70 && marks<=79){
			ch='C';
		}
	    else if(marks>=60 && marks<=69){
			ch='D'
		}
		else if(marks<60 ){
			ch='F'
		}
		return ch;
	}
	public static String(char a){
		String comment="";
		if(a=='A'){
			comment="Excellent";
		}
		else if(a=='B'){
			comment="Good";
		}
		else if(a=='C'){
			comment="Fair";
		}
		else if(a=='D'){
			comment="Needs Improvement";
		}
		else if(a=='F'){
			comment="Fail";
		}
		return comment;
		
	}
	public static int  calculateTotal(int[] marks){
		int sum=0;
		for(int i=0;i<marks.length;i++){
			sum +=marks[i]
		}
		return sum;
	}
public static double calculateAverage(int marks[]){
	double average=0;
	int prevSum
	prevSum = calculateTotal(marks[])
	average=prevSum/marks.length;	
	}
}
	public static void main(String[] args)
	{
		String[] students = new String[7];
		int marks = new int[students.length];
	}
	
}