import java.util.*;
public class fib{
	//fob lists the fib numbers
	//@pre requires int n >0, indicates how many fib numbers to be printed
	//This is O(n+n)=O(n) because the time it takes to add and print the fib numbers is based off how many numbers are being added.
	public static void fob(int n){
		int[] arr = new int [n];
		arr[0]=0;
		if(n>0){
			arr[1]=1;

			for (int i=2; i<n;i++){
				arr[i]=arr[i-2]+arr[i-1];
			}
		}

		for(int i =0; i<n;i++){
			System.out.print(Integer.toString(arr[i])+", ");
		}

	}

	//oOrE lists whether the number in the fib list is odd or even
	//@pre requires int n>0 to indicate how many fib numbers are to be tested for even or odd
	//This is O(n+n)=O(n) because the length of time it takes to add into the array is based off the size of n. The array search is also linear since it is based of its size.
	public static void oOrE(int n){
		int[] arr = new int [n];
		arr[0]=0;
		if(n>0){
			arr[1]=1;

			for (int i=2; i<n;i++){
				arr[i]=arr[i-2]+arr[i-1];
			}
		}

		for(int i=0; i<n; i++){
			if (arr[i]%2==1){
				System.out.println(Integer.toString(arr[i])+"is odd");
			}
			else{
				System.out.println(Integer.toString(arr[i])+"is even");
			}
		}
	}
	//returns fib number
	public static int fab(int n){
		if (n==0||n==1){
			if (n==0){
				return 0;
			}
			else{
				return 1;
			}
		}
		else{
			return fab(n-2)+fab(n-1);
		}
	}
	//pair lists the number of pair of fib numbers that add up to n
	//@pre n >0
	//O(n*(n-1)+(n+5))=O(n^2) because of the nested for loop. Since the nested loop goes through the array twice, the O space is sqaured.
	public static void pair(int n){

		int[] arr = new int [n+5];
		arr[0]=0;
		
		if(n>0){
			arr[1]=1;

			for (int i=2; i<n+5;i++){
				arr[i]=arr[i-2]+arr[i-1];
			}
		}

		for (int i = 0;i<n+5;i++){

			for(int j = i+1; j<n+5;j++){
				
				if((arr[i]+arr[j])==n){

					System.out.println(Integer.toString(arr[i]) + " and "+ Integer.toString(arr[j])+" equal "+Integer.toString(n));
				}
			}
		}
	}

	//sumOfArray returns a list of sum of the elements in the array
	//@pre requires 2 arrays filled with ints
	//O(i*n) (i is the size of first array n is size of second array)
	public static void sumOfArray(int[] a, int[] b){
		for(int i=0; i<a.length;i++){
			for(int j=0; j<b.length;j++){
				int sum = a[i]+b[j];
				System.out.println("Sum of "+Integer.toString(a[i])+" and "+Integer.toString(b[j])+" is "+ sum);
			}
		}
	}

	//binarySearch returns the index of a value;
	//@pre requires an array of ints and a int to search for
	//O(log2(n)) since binary search. Each search decreases yoru search space by half n/2^i, where i is the number of searches done.
	public static void binarySearch(int[] a, int b){
		
		int first = 0;
		int last = a.length;
		int ans=0;
		Boolean v = false;
		while(!v&&first<=last){
			int mid = first+last/2;
			if(a[mid]==b){
				v=true;
				ans = mid;
			}
			else if (a[mid]>b){
				last = mid -1;
			}
			else{
				first = mid +1;
			}
		}

		System.out.println(Integer.toString(ans));
	}


	public static void main(String[] args){
		Scanner sc=	new Scanner(System.in);
		System.out.println("Show how many fib numbers:");
		int s = sc.nextInt();
		fob(s);
		System.out.println("\n");
		oOrE(s);
		pair(3);
		int[] arr1={1,2,3,4,5};
		int[] arr2={23,4,51,315};
		sumOfArray(arr1,arr2);
		binarySearch(arr1,1);
	}

}