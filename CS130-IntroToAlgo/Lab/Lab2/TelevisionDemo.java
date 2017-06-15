//television demo
//Charlson So 3/8/2017

import java.util.Scanner;  // Needed for the Scanner class

/*
   This class demonstrates the Television class.
*/

public class TelevisionDemo
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      int station;         // The user's channel choice

      // Declare and instantiate a television object
      Television bigScreen = new Television("Toshiba", 55);

      // Turn the power on
      bigScreen.power();

      // Display the state of the television
      System.out.println("A " +
                         bigScreen.getScreenSize() +
                         " inch " +
                         bigScreen.getManufacturer() +
                         " has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // Decrease the volume of the television
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());

      

      // HERE IS WHERE YOU DO TASK #5

      //set new portable tv, sharp 19
      Television portable = new Television("Sharp",19);
      //poweron
      bigScreen.power();

      System.out.println("Television "+portable.getScreenSize()+" "+portable.getManufacturer()+" has been turned on");
      //input channel and set
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      portable.setChannel(station);

      //decrease volume by 2
      portable.decreaseVolume();
      portable.decreaseVolume();
      //print out portable tv stats
      System.out.println("Channel: " +
                         portable.getChannel() +
                         " Volume: " +
                         portable.getVolume());





   }
}