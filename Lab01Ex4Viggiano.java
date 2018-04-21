import java.awt.*;
/*
 *Sherry Viggiano
 *ISTE 120-
 *Lab 01 
 * 1/22/2018
 */


public class Lab01Ex4Viggiano {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex4Viggiano", 500, 500);
      
      
      // create large blue rectangle
       Rectangle rectangle1 = new Rectangle (50, 100, 200,100,true);
       rectangle1.setColor(Color.blue);
       System.out.println("My Rectangle:" + rectangle1);
       canvas.draw(rectangle1);
      
      // create smaller blue rectangle
      
      
      // create five black circles
        Circle myCircle = new Circle (20, 60, 30);
        myCircle.setColor(Color.black);
        System.out.println("My Circle:" + myCircle);
        canvas.draw(myCircle);
      
      
      // create red rectangle
      
      // create red rectangle
   }
}