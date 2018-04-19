import java.awt.*;
import java.util.*;
/**
 * ISTE 120-01
 * Sherry Viggiano
 * ISTE 120-01
 * Lab 2  
 *
 */

public class TestPicture3 
{
   private Circle sun;
 
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in); // using scanner class so code can be broken up

       Picture3 picture = new Picture3(); // constructor
       picture.draw();
       
       System.out.println("Press Enter to continue:");
       in.nextLine();
       
        picture.setNewColors(); // calling method to set colors

       
       System.out.println("Press Enter to continue:");   // calling print method and then a command which pauses script until user hits enter
       in.nextLine();

       
       picture.setOrigColors(); // calling method to return to original colors

       picture.draw(); // calling method to redraw picture
       
       
        System.out.println("Press Enter to continue:");  // calling print method and then a command which pauses script until user hits enter
        in.nextLine();
    
          }
} 