//Charlson So
//Lab 5
//Joshua Lim
/**
   Represents time in hours and minutes using
   the customary conventions.
*/

public class Time
{
   private int hours;         // Conventional hours
   private int minutes;       // Conventional minutes
   private boolean afternoon; // Flag for afternoon

   /**
      Constructs a cutomary time (12 hours, am or pm)
      from a military time ##:##
      @param militaryTime Time in the military
             format ##:##
   */

   public Time(String militaryTime)
   {
      // Check to make sure something was entered
      if (militaryTime == null)
      {
         System.out.println(militaryTime +
                            " is not a " +
                            "valid miliary time. Error 1" );
      }
      // Check to make sure there are 5 characters
      else if (militaryTime.length()!=5)
      {
         System.out.println(militaryTime +
                            " is not a " +
                            "valid miliary time. 2" );
      }
      else
      {
         // Check to make sure the colon is in
         // the correct spot
         if (militaryTime.indexOf(':')!=2)
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time.3" );
         }
         // Check to make sure all other characters
         // are digits
         else if (!Character.isDigit(militaryTime.charAt(0)))
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time.4" );
         }
         else if (!Character.isDigit(militaryTime.charAt(1)))
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time.5" );
         }
         else if (!Character.isDigit(militaryTime.charAt(3)))
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time.6" );
         }
         else if (!Character.isDigit(militaryTime.charAt(4)))
         {
            System.out.println(militaryTime +
                               " is not a " +
                               "valid miliary time.7" );
         }
         else
         {
            String j = militaryTime.substring(0,2);
            hours=Integer.parseInt(j);
            String t=militaryTime.substring(3);
            minutes = Integer.parseInt(t);

            // Validate hours and minutes are valid values
            if(hours > 23)
            {
               System.out.println(militaryTime +
                                  " is not a " +
                                  "valid miliary time.8" );
            }
            else if(minutes > 59)
            {
               System.out.println(militaryTime +
                                  " is not a " +
                                  "valid miliary time.9" );
            }
            // Convert military time to conventional time
            // for afternoon times
            else if (hours > 12)
            {
               hours = hours - 12;
               afternoon = true;
               System.out.println(this.toString());
            }
            // Account for midnight
            else if (hours == 0)
            {
               hours = 12;
               System.out.println(this.toString());
            }
            // Account for noon
            else if (hours == 12)
            {
               afternoon = true;
               System.out.println(this.toString());
            }
            // Morning times do not need converting
            else
            {
               System.out.println(this.toString());
            }
         }
      }
   }

   /**
      The toString method returns a conventional time.
      @return A conventional time with am or pm.
   */
   public String toString()
   {
      String am_pm;
      String zero = "";

      if (afternoon)
         am_pm = "PM";
      else
         am_pm = "AM";
      if (minutes < 10)
         zero = "0";
      return hours + ":" + zero + minutes + " " + am_pm;
   }
}