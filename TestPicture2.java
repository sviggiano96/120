import java.awt.*;
import java.util.*;
/**
 * Sherry Viggiano
 * ISTE 120-01-
 * Lab 2 
 * 
 *
 */


public class TestPicture2 //TestPicture2 class
{
    
   public static void main(String[] args)  // main method
   {
   Scanner in = new Scanner(System.in); // allowing for whitespace, breaks up input.

       Picture2 picture = new Picture2(); // constructor
       picture.draw();  // draw method
       
       System.out.println("Press Enter to continue:"); // calling print method and then a command which pauses script until user hits enter
       in.nextLine();
       
       
       picture.setNewColors(); // calling method to set colors
        System.out.println("Press Enter to continue:"); // calling print method and then a command which pauses script until user hits enter
       in.nextLine();

       picture.setOrigColors(); // calling method to return to original colors
        System.out.println("Press Enter to continue:");
       in.nextLine();

          }
   
} 