import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * Class Canvas ... class to allow users to draw simple geometrical shapes
 * Can draw Lines, Rectangles, Circles, and strings on a canvas.
 * Extends JFrame ... the constructor inits and shows the JFrame
 * Other methods draw on the canvas, inside the JFrame.
 */
public class Canvas extends JFrame {
   private ArrayList<Object> shapes = new ArrayList<Object>();
   private Pane canvas = new Pane();
   private int width;
   private int height;
   
   /**
    * Default constructor ... constructs a 300x300 canvas
    * @param title - String for the title bar of the window
    */
   public Canvas(String title) {
      super();
      this.width = 300;
      this.height = 300;
      this.setSize(this.width,this.height);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.add(canvas, BorderLayout.CENTER);
      this.setTitle(title);
      this.setVisible(true);
   }
   
   /**
    * Parameterized constructor, size of canvas given as parameters
    * @param title String for the title bar of the window
    * @param width the width of the canvas
    * @param height the height of the canvas
    */
   public Canvas(String title, int width, int height) {
      super();
      this.width = width;
      this.height = height;
      this.setSize(this.width, this.height);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.add(canvas, BorderLayout.CENTER);
      this.setTitle(title);
      this.setVisible(true);
   }
   
   /**
    * getWidthInt - accessor to get the width of the canvas
    * @return the width (in pixels) of the canvas
    */
   public int getWidthInt() { return width; }
   
   /**
    * getHeightInt - accessor to get the height of the canvas
    * @return the height (in pixels) of the canvas
    */
   public int getHeightInt() { return height; }
   
   /**
    * draw - Draw a shape (Line, Rectangle or Circle) in BLACK
    * Adds the shape to the shapes in the canvas then calls repaint
    * @param s the shape to add
    */
   public void draw(Shape s) {
      shapes.add(s);
      canvas.repaint();
   }
      
   /**
    * erase - erase a shape
    * @param s shape to erase
    */
   public void erase(Shape s) {
      if(!shapes.remove(s)) System.out.println("Cannot erase " + s);
      canvas.repaint();
   }
   
   /**
    * animate - animate a drawing. Done by repeatedly calling the animator's
    * moveShapes method, with a delay in between drawing. The delay and the
    * animators are parameters. The return from moveShapes determines whether
    * to continue or not.
    * @param an an object of an Animator class
    * @param delay a number of ms to delay between calls to moveShapes
    */
   public void animate(Animator an, int delay) {
      while(an.moveShapes()) {
         try { Thread.currentThread().sleep(delay); } catch(Exception e) {}
         this.repaint();
      }
   }
   
   /**
    * toString - method to return a description of the Canvas
    * as a printable string.
    * @return string representation of the Canvas
    */
   public String toString() {
      return this.getClass().getName() + "[width=" + ((int)getWidth()) + ",height=" + ((int)getHeight()) + "]";
   }
   
   /**
    * redraw - Redraw the entire picture
    */
   public void redraw() { canvas.repaint(); }
    
   /**
    * Internal class to represent the canvas
    */
   class Pane extends JPanel {
      public void paintComponent(Graphics g) {
         synchronized(canvas) {
            super.paintComponent(g);
            Graphics2D g2D = (Graphics2D) g;
            for(Object obj: shapes) {
               g2D.setPaint(Color.BLACK);
               if(obj instanceof Line) g2D.setPaint(((Line)obj).getColor());
               if(obj instanceof Circle) g2D.setPaint(((Circle)obj).getColor());
               if(obj instanceof Rectangle) g2D.setPaint(((Rectangle)obj).getColor());
               if(obj instanceof Triangle) g2D.setPaint(((Triangle)obj).getColor());
               g2D.draw((Shape)obj);
               if(obj instanceof Circle && ((Circle)obj).getFill()) g2D.fill((Circle) obj);
               if(obj instanceof Rectangle && ((Rectangle)obj).getFill()) g2D.fill((Rectangle) obj);
               if(obj instanceof Triangle && ((Triangle)obj).getFill()) g2D.fill((Triangle) obj);
            }
         }
      } // of synchronized
   }
}