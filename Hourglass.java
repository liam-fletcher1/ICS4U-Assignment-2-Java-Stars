 /*
  * The Hourglass Star Program
  *
  * @author  Liam Fletcher
  * @version 1.0
  * @since   2021-12-14
  */

 import java.util.Scanner;

 final class Hourglass {

     /**
      * Prevent instantiation
      * Throw an exception IllegalStateException.
      * if this ever is called
      *
      * @throws IllegalStateException
      *
      */
     private Hourglass() {
         throw new IllegalStateException("Cannot be initated.");
     }

     /**
      * The starting main() function.
      *
      * @param args Name of file containing a string of numbers
      * @throws NumberFormatException if error occurs.
      */
     public static void main(final String[] args) {
         Stars hourGlass = new Stars();
         final Scanner userInput = new Scanner(System.in);
         System.out.print("\nInput size of hourglass: ");
         final String usrInput = userInput.nextLine();
         try {
             final int glassSize = Integer.valueOf(usrInput);
             if (glassSize > 0) {
                 String hourglassTop = hourGlass.topHalf(glassSize, 0);
                 String hourglassBottom = hourGlass.bottomHalf(0, glassSize,
                     glassSize);
                 System.out.print(hourglassTop);
                 System.out.print(hourglassBottom);
             } else {
                 System.out.println("\nEnter a positive integer.");
             }
         } catch (NumberFormatException errorCode) {
             System.err.print("\nInvaild Input");
         }
         System.out.println("\nDone.");
     }
 }
