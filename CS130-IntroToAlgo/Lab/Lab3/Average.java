import java.util.*;

public class Average{

	private int[] data = new int[5];
	private double mean;

	Average(){
		Scanner sc = new Scanner(System.in);
		int count =1;
		while(count<6){
			System.out.println("Enter number into space "+count);
			int v = sc.nextInt();
			data[count-1]=v;
			count++;
		}
		calculateMean();
		
	}

	public void calculateMean(){
		int total=0;
		for (int i =0; i<5; i++){
			total +=data[i];
		}
		mean = total/5.0;
		System.out.println("Average of the list is: "+ mean);
	}


	public void selectionSort(){
		int temp;
		for (int i = 0; i<5;i++){
			for(int j=i+1;j<5;j++){
				if(data[i]>data[j]){
				temp=data[j];
				data[j]=data[i];
				data[i]=temp;
				}
			}
		}
	}

	public String toString(){
		String l = "";
		int j=4;

		while(j>=0){
			l+=Integer.toString(data[j]);
			l+=" ";
			j--;
		}

		return l;
	}
}
