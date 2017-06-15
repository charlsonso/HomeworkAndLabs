//LAB 1
//Group: Charlson So
#include <iomanip>
#include <math.h>
#include <iostream>
using namespace std;



/* recursivePower returns the power of a number
	@pre args must be a number and a int number > 0
	@return generic type of j^n
*/
template<typename S>
S recursivePower(S j, unsigned int a){
	
	if (a<1){
		return 1;
	}
	else{
		return recursivePower(j, a-1)*j;
	}
}



/* binarySearch searches for a data type by splitting the array and searching for the target
	@pre an array, the first value and last value you are searching for and the target value
	@post returns index of the target in the array
	@param first and last must be index numbers i.e. >0
	@return int that represents the index of the target in the array
*/
template<typename S>
int binarySearch(S arr[], int first, int last, S target){
	int index;
	if (first>last){
		index=-1;
	}
	else{
		int mid = first+(last-first)/2;
		if(target==arr[mid]){
			index=mid;
		}
		else if(target<arr[mid]){
			index=binarySearch(arr,first,mid-1,target);
		}
		else{
			index=binarySearch(arr,mid+1,last,target);
		}
	}
	return index;
}



/* maxArray tests through and finds the largest value in an array
	@pre array and length of array
	@post returns the largest number in array
	@return generic type of the largest value in the array
*/
template<typename S>
S maxArray(S arr[], int length){
	if (length==1){
		return arr[0];
	}
	else{
		return (arr[length-1]>maxArray(arr, length-1))?arr[length-1]:maxArray(arr,length-1);
	}
}


/* reverseDigits takes an integer and returns the numbers in reverse
	@pre must be postive integer
	@post returns integer in reverse
	@param a>0
	@return int value of the digits in reverse
*/
unsigned int reverseDigits(unsigned int a){
	if (a<10){
		return a;
	}

	else{
		int firstnum=a;
		int digit=0;
		
		while(firstnum>10){
			firstnum=firstnum/10;
			digit++;
		}
		
		int remainding = a-(firstnum*pow(10,digit));
		return firstnum+reverseDigits(remainding)*10;
	}

}


int main(){

	cout<<"RecursivePower Test"<<endl;
	cout<<recursivePower(2,10)<<endl;
	cout<<recursivePower(6,10)<<endl;
	cout<<recursivePower(5,10)<<endl;
	cout<<recursivePower(4,10)<<endl;
	cout<<recursivePower(3,10)<<endl;	

	cout<<"Reverse Digits Test"<<endl;
	cout<<reverseDigits(123)<<endl;
	cout<<reverseDigits(51234)<<endl;
	cout<<reverseDigits(12432)<<endl;
	cout<<reverseDigits(22452)<<endl;
	cout<<reverseDigits(12345)<<endl;

	int a[]={1,2,3,4,5,6,7,8,9,0};
	double b[]={1.2,2.3,3.4,4.5,6.7,6.9,4.7,9.8,2.2,1.1};
	char c[]={'a','b','c','d'};

	cout<<"BinarySearch Test"<<endl;
	cout<<binarySearch(a,0,9,4)<<endl;
	cout<<binarySearch(b,0,9,2.3)<<endl;
	cout<<binarySearch(c,0,3,'c')<<endl;

	cout<<"MaxArray Test"<<endl;
	cout<<maxArray(a,10)<<endl;
	cout<<maxArray(b,10)<<endl;
	cout<<maxArray(c,5)<<endl;



}


