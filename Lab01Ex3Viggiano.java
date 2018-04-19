import java.awt.*;

public class Lab01Ex3Viggiano {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex3Viggiano", 500, 500);
   
   
 Circle myCircle = new Circle (20, 60, 30);
 myCircle.setColor(Color.blue);
 System.out.println("My Circle:" + myCircle);
 canvas.draw(myCircle);   
 
 myCircle.setXInt(myCircle.getXInt()+150);
  
   
   }
   
   
}