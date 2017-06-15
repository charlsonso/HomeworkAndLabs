import java.util.Scanner;

/**
   This program calculates the geometric and
   harmonic progression for a number entered
   by the user.
*/

public class Progression
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);

      System.out.println("This program will calculate " +
                         "the geometric and harmonic " +
                         "progression for the number " +
                         "you enter.");
                         
      System.out.print("Enter an integer that is " +
                       "greater than or equal to 1: ");
                       
      int input = keyboard.nextInt();

      // Match the method calls with the methods you write
      int geomAnswer = geometricRecursive(input);
      double harmAnswer = harmonicRecursive(input);

      System.out.println("Using recursion:");
      
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
                         
      System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);

      // Match the method calls with the methods you write
      geomAnswer = geometricIterative(input);
      harmAnswer = harmonicIterative(input);

      System.out.println("Using iteration:");
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
                         
      System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);
   }

   // ADD LINES FOR TASK #2 HERE
   // Write the geometricRecursive method
   //O(a)
   public static int geometricRecursive(int a){
      if(a==1){
        return 1;
      }
      else{
        return geometricRecursive(a-1)*a;
      }
   }
   // Write the geometricIterative method
   //O(a)
   public static int geometricIterative(int a){
    int j =1;
    for (int i=1; i<=a;i++){
      j*=i;
    }
    return j;
   }
   // Write the harmonicRecursive method
   public static double harmonicRecursive(int a){
    if (a==1){
      return 1;
    }
    else{
      double j = 1/((double) a);
      return harmonicRecursive(a-1)*j;
    }
   }
   // Write the harmonicIterative method
   public static double harmonicIterative(int a){
    double j = 1;
    for(int i=1; i<=a; i++){
      j *= 1/((double)i);
    }
    return j;
   }
}