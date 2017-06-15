import java.util.Scanner;
import java.util.*;
public class loop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int buf=0;
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int sm, lg;
		System.out.println("Add numbers to find the largest or smallest in a list");
		while (buf!=-99){
			System.out.println("Add number (input -99 to exit)");
			buf = sc.nextInt();
			if (buf!=-99){
				l1.add(buf);
				System.out.println("Pushing"+buf+" to array.");
			}
		}
		sm=l1.get(0);
		lg=l1.get(0);
		for (int i=0; i<l1.size(); i++){
			if (l1.get(i)<sm){
				sm=l1.get(i);
			}
			else if (l1.get(i)>lg){
				lg=l1.get(i);
			}
		}
		System.out.println("Largest number added: "+lg);
		System.out.println("Smallest number added:"+sm);
	}
}