import java.awt.*;
import java.util.*;

/**
 * ISTE 120-01
 * Sherry Viggiano
 * 2/19/18
 * Lab 4 - exercise 2 simple animation
 *
 */


public class Arrow
{
// declared and gave a name
   public Canvas canvas;
   public Triangle head;
   public Rectangle shaft;


   public Arrow(Canvas canvas)
   {
      //how to make the constructor change canvas?? This is the contructor. used to create object in main program from class.
      // this applies to attributes on a class so you can use again in the class explicitly. 
      this.canvas = canvas;
      
      // don't need data type b/c already used
         this.head = new Triangle(125, 550, 50, 50, Color.BLACK, true);
      
         this.shaft = new Rectangle(145, 600, 10, 100, Color.BLACK, false);
      
      //taking in a paramater in a constructor in the parathesis, this is how you tell it you are adding a canvas to be called
      
      
   }  
      public void draw(){
            canvas.draw(head);
            canvas.draw(shaft);           
          }
      public void erase(){
            canvas.erase(head);
            canvas.erase(shaft);
      }
      public void moveUp()
      {
         head.setYInt(head.getYInt() - 50);
         shaft.setYInt(shaft.getYInt() - 50);
         
      }
     
     }
   
   