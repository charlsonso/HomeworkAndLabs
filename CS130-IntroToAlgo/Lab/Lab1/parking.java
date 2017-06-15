import java.util.*;

public class parking{
	public static double calculateCharges(double a){
		if (a<=0){
			return 0;
		}
		else if (a<=3){
			return 2;
		}
		else if (a>=24){
			return 10;
		}
		else{
			return 2+0.5*(a-3);
		}
	}

	public static void main(String[] args){
		System.out.print("Enter hours at parking structure: ");
		Scanner sc = new Scanner(System.in);
		double hr = sc.nextDouble();
		double l = calculateCharges(hr);
		System.out.printf("$%.2f\n",l);
	}
	
}
