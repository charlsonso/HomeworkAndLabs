import java.util.*;

public class bag{
	private ArrayList<Double> ar = new ArrayList<Double>();
	private int size;

   bag(){
		
	}

	public void ad(double i){
		ar.add(i);
	}

   public double[] toArray(){
      int size = ar.size();
      double[] arr = new double[size];
      for(int i =0; i<size; i++){
         arr[i]=ar.get(i);
      }
      return arr;
   }

   public double[] sort(){
      double[] arr = toArray();
      int size = arr.length;
      int i, j, max; 
      double temp;
      
      for(i = 0; i< size -1 ; i++ )
      {
            max = 0;
            for(j = 1; j <size -1 -i ; j++)
            {
               if(arr[j] > arr[max])
                  max= j;
            }
            temp = arr[size -1 -i];
            arr[size -1 -i] = arr[max];
            arr[max] = temp ;    
      }
      return arr;
   }

}