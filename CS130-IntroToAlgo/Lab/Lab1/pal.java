//copyright Charlson So 
//CSIS130 LAB # 1
import java.util.Scanner;
import java.lang.String;

public class pal{
	public static void main(String[] args){
		int a=0;
		Scanner b = new Scanner(System.in);
		String d;
		
		do{
			System.out.println("Enter a five digit number: ");
			d = b.nextLine();
			if (d.length()!=5){
				System.out.println("Error: User Input Denied.");
			}
		}while(d.length()!=5);

		int c = d.length()-1;

		do{
			
			if (d.charAt(a) != d.charAt(c)){
				System.out.println("Not a Palidrome");
				c=1; a=5;
			}
			a+=1;
			c-=1;
		}while(c>a);

		if (c==a){
			System.out.println("Palidrome");
		}
		
	}
}