//copyright Charlson So 
//CSIS130 LAB # 1

import java.util.Scanner;
public class Mileage{
	public static void main(String[] args){
		System.out.println("Program will calculate mileage.\n");
		System.out.println("Enter miles drive: ");
		Scanner a= new Scanner(System.in);
		int b = a.nextInt();
		System.out.println("Enter gallons used: ");
		int c = a.nextInt();
		double d= Double.valueOf(b)/c;
		System.out.println("MPG: "+ d);
	}
}