import java.awt.geom.*;
import java.awt.*;

/**
 * Simple wrapper class to wrap a 2D Line.
 * Simply converts int x,y pairs to doubles.
 */
public class Line extends Line2D.Double {
   private Color color = Color.BLACK;
   
   /**
    * Constructor for a line from (x1,y1) to (x2,y2).
    * @param x1 - x location of one end of the line
    * @param y1 - y location of one end of the line
    * @param x2 - x location of the other end of the line
    * @param y2 - y location of the other end of the line
    */
   public Line(int x1, int y1, int x2, int y2) {
      super((double) x1, (double) y1, (double) x2, (double) y2);
   }
   
   /**
    * Constructor for a line from (x1,y1) to (x2,y2). Allows the color to be given.
    * @param x1 - x location of one end of the line
    * @param y1 - y location of one end of the line
    * @param x2 - x location of the other end of the line
    * @param y2 - y location of the other end of the line
    * @param _color the color for the line
    */
   public Line(int x1, int y1, int x2, int y2, Color _color) {
      super((double) x1, (double) y1, (double) x2, (double) y2);
      color = _color;
   }
   
   /**
    * toString - string representation of a Line
    * @return a string representation in the form: Line[x1=x1value,y1=y1value,x2=x2value,y2=y2value]
    */
   public String toString() {
      return this.getClass().getName() + "[x1=" + ((int)getX1()) + ",y1=" + ((int)getY1()) + 
         ",x2=" + ((int)getX2()) + ",y2=" + ((int)getY2()) + ",color=" + color + "]";
   }
   
   /**
    * getX1Int - accessor for the x1 position of the line, returned as an int. The underlying class
    * represents a Line with the x1 as a double.
    * @return x1 position of the line as an int
    */
   public int getX1Int() { return (int) super.getX1(); }
   
   /**
    * getY1Int - accessor for the y1 position of the line, returned as an int. The underlying class
    * represents a Line with the y1 as a double.
    * @return y1 position of the line as an int
    */
   public int getY1Int() { return (int) super.getY1(); }
   
   /**
    * getXInt - accessor for the x2 position of the line, returned as an int. The underlying class
    * represents a Line with the x2 as a double.
    * @return x2 position of the line as an int
    */
   public int getX2Int() { return (int) super.getX2(); }
   
   /**
    * getY2Int - accessor for the y2 position of the line, returned as an int. The underlying class
    * represents a Line with the y2 as a double.
    * @return y2 position of the line as an int
    */
   public int getY2Int() { return (int) super.getY2(); }
   
   /**
    * getColor - accessor for the color of the line.
    * @return the color of the line
    */
   public Color getColor() { return color; }
      
   /**
    * setX1Int - Mutator to change the x position of the line to an int value
    * @param _x1 the new value of x1
    */
   public void setX1Int(int _x1) { setLine(_x1, this.getY1(), this.getX2(), this.getY2()); }
   
   /**
    * setY1Int - Mutator to change the y1 position of the line to an int value
    * @param _y1 the new value of y1
    */
   public void setY1Int(int _y1) { setLine(this.getX1(), _y1, this.getX2(), this.getY2()); }
   
   /**
    * setX2Int - Mutator to change the x2 position of the line to an int value
    * @param _x2 the new value of x2
    */
   public void setX2Int(int _x2) { setLine(this.getX1(), this.getY1(), _x2, this.getY2()); }
   
   /**
    * setY2Int - Mutator to change the y2 position of the rectangle to an int value
    * @param _y2 the new value of y2
    */
   public void setY2Int(int _y2) { setLine(this.getX1(), this.getY1(), this.getX2(), _y2); }
   
   /**
    * setColor - Mutator to change the color of the line
    * @param _color the new color for the Line
    */
   public void setColor(Color _color) { color = _color; }
   
}