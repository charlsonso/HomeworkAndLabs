
import java.util.*;
public class bucket{
	public static void main(String[] args){
		double[] j = {0.15,0.25,0.5,0.18,0.014,0.2};
		int size = j.length;
		bag[] nBags = new bag[size];
		
		for (int i =0; i<size; i++){
			nBags[i]= new bag();
		}

		for(int i = 0; i<size;i++){
			int whichB = (int) (size*j[i]);
			bag goesInto = nBags[whichB];
			goesInto.ad(j[i]);
		}



		int count = 0;
		for(int i=0; i<size;i++){
			double[] k = nBags[i].sort();
			for(int l=0; l<k.length;l++){
				j[count]=k[l];
				count++;
			}
		}

		for (int i=0; i<size;i++){
			System.out.println(Double.toString(j[i]));
		}



	}
}