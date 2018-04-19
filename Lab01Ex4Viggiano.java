import java.awt.*;
/*
 *Sherry Viggiano
 *ISTE 120-01
 *Lab 01 
 * 1/22/2018
 */


public class Lab01Ex4Viggiano {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex4Viggiano", 500, 500);
      
      
      // create large blue rectangle
       Rectangle rectangleBlue1 = new Rectangle (20, 100, 370,120,true);
       rectangleBlue1.setColor(Color.BLUE);
       System.out.println("My Rectangle:" + rectangleBlue1);
       canvas.draw(rectangleBlue1);
      
           
      // create red rectangle
      Rectangle rectangleRed1 = new Rectangle (400, 150, 160, 72,true);
      rectangleRed1.setColor(Color.RED);
      System.out.println("My Rectangle:" + rectangleRed1);
      canvas.draw(rectangleRed1);
      
      Rectangle rectangleRed2 = new Rectangle (400, 100, 100, 80,true);
      rectangleRed2.setColor(Color.RED);
      System.out.println("My Rectangle:" + rectangleRed2);
      canvas.draw(rectangleRed2);
      
      Rectangle rectangleRed3 = new Rectangle (250, 220, 310, 15,true);
      rectangleRed3.setColor(Color.RED);
      System.out.println("My Rectangle:" + rectangleRed3);
      canvas.draw(rectangleRed3);
       
      Rectangle rectangleRed4 = new Rectangle (20, 220, 140, 15,true);
      rectangleRed4.setColor(Color.RED);
      System.out.println("My Rectangle:" + rectangleRed4);
      canvas.draw(rectangleRed4); 

      
             
      // create five black circles
        Circle myCircle1 = new Circle (490, 240, 30, true);
        myCircle1.setColor(Color.BLACK);
        System.out.println("My Circle:" + myCircle1);
        canvas.draw(myCircle1);
        
        Circle myCircle2 = new Circle (315, 240, 30, true);
        myCircle2.setColor(Color.BLACK);
        System.out.println("My Circle:" + myCircle2);
        canvas.draw(myCircle2);
        
        Circle myCircle3 = new Circle (250, 240, 30, true);
        myCircle3.setColor(Color.BLACK);
        System.out.println("My Circle:" + myCircle3);
        canvas.draw(myCircle3);
               
        Circle myCircle4 = new Circle (85, 240, 30, true);
        myCircle4.setColor(Color.BLACK);
        System.out.println("My Circle:" + myCircle4);
        canvas.draw(myCircle4);
        
        Circle myCircle5 = new Circle (20, 240, 30, true);
        myCircle5.setColor(Color.BLACK);
        System.out.println("My Circle:" + myCircle5);
        canvas.draw(myCircle5);
        
        
         // create smaller blue rectangle The last item drawn is drawn on top. 
      Rectangle rectangleBlue2 = new Rectangle (415, 110, 70, 40,true);
      rectangleBlue2.setColor(Color.BLUE);
      System.out.println("My Rectangle:" + rectangleBlue2);
      canvas.draw(rectangleBlue2);

        
   }
}