import java.awt.geom.*;
import java.awt.*;

/**
 * Simple wrapper class to wrap a 2D Ellipse with two identical radii
 * Such an ellipse is a circle.
 */
public class Rectangle extends Rectangle2D.Double {
   private boolean fill = false;
   private Color color = Color.BLACK;
   
   /** 
    * Rectangle - constructor ... uses Rectangle2D.Double. Default fill flag is FALSE.
    * @param _x the x position of the upper left corner of the rectangle
    * @param _y the y position of the upper left corner of the rectangle
    * @param _width the width of the rectangle
    * @param _height the height of the rectangle
    */
   public Rectangle(int _x, int _y, int _width, int _height) {
      super((double) _x, (double) _y, (double) _width, (double) _height);
   }
   
   /** 
    * Rectangle - constructor ... uses Rectangle2D.Double. Color may be given.
    * Default fill flag is FALSE.
    * @param _x the x position of the upper left corner of the rectangle
    * @param _y the y position of the upper left corner of the rectangle
    * @param _width the width of the rectangle
    * @param _height the height of the rectangle
    * @param _color the color of the rectangle
    */
   public Rectangle(int _x, int _y, int _width, int _height, Color _color) {
      super((double) _x, (double) _y, (double) _width, (double) _height);
      color = _color;
   }
   
   /** 
    * Rectangle - constructor ... uses Rectangle2D.Double.
    * Allows the user to specify a fill flag.
    * @param _x the x position of the upper left corner of the rectangle
    * @param _y the y position of the upper left corner of the rectangle
    * @param _width the width of the rectangle
    * @param _height the height of the rectangle
    * @param _fill boolean fill flag for the rectangle ... true means draw the rectangle filled
    */
   public Rectangle(int _x, int _y, int _width, int _height, boolean _fill) {
      super((double) _x, (double) _y, (double) _width, (double) _height);
      fill = _fill;
   }
   
   /** 
    * Rectangle - constructor ... uses Rectangle2D.Double.
    * Allows the user to specify a fill flag. Also the color.
    * @param _x the x position of the upper left corner of the rectangle
    * @param _y the y position of the upper left corner of the rectangle
    * @param _width the width of the rectangle
    * @param _height the height of the rectangle
    * @param _color the color of the rectangle
    * @param _fill boolean fill flag for the rectangle ... true means draw the rectangle filled
    */
   public Rectangle(int _x, int _y, int _width, int _height, Color _color, boolean _fill) {
      super((double) _x, (double) _y, (double) _width, (double) _height);
      fill = _fill;
      color = _color;
   }
   
   /**
    * toString - string representation of a Circle
    * @return a string representation in the form: Circle[x=xvalue,y=yvalue,radius=radiusvalue]
    */
   public String toString() {
      return this.getClass().getName() + "[x=" + ((int)getX()) + ",y=" + ((int)getY()) 
         + ",width=" + ((int)getWidth()) + ",height=" + ((int)getHeight())  + ",color=" + getColor() + ",fill=" + getFill() + "]";
   }
   
   /**
    * getXInt - accessor for the x position of the rectangle, returned as an int. The underlying class
    * represents a rectangle with the x as a double.
    * @return x position of the rectangle as an int
    */
   public int getXInt() { return (int) super.getX(); }
   
   /**
    * getYInt - accessor for the y position of the rectangle, returned as an int. The underlying class
    * represents a rectangle with the y as a double.
    * @return y position of the rectangle as an int
    */
   public int getYInt() { return (int) super.getY(); }
   
   /**
    * getWidthInt - accessor for the width of the rectangle, returned as an int. The underlying class
    * represents a rectangle with the width as a double.
    * @return width of the rectangle as an int
    */
   public int getWidthInt() { return (int) super.getWidth(); }
   
   /**
    * getHeightInt - accessor for the height of the rectangle, returned as an int. The underlying class
    * represents a rectangle with the height as a double.
    * @return height of the rectangle as an int
    */
   public int getHeightInt() { return (int) super.getHeight(); }
   
   /**
    * getColor - accessor for the color of the rectangle
    * @return color of the rectangle
    */
   public Color getColor() { return color; }
   
   /**
    * getFill - accessor for the fill flag for the rectangle ... true means fill the rectangle
    * @return fill flag for the rectangle
    */
   public boolean getFill() { return fill; }
      
   /**
    * setXInt - Mutator to change the x position of the rectangle to an int value
    * @param _x the new value of x
    */
   public void setXInt(int _x) { setRect(_x, this.getY(), this.getWidth(), this.getHeight()); }
   
   /**
    * setYInt - Mutator to change the y position of the rectangle to an int value
    * @param _y the new value of y
    */
   public void setYInt(int _y) { setRect(this.getX(), _y, this.getWidth(), this.getHeight()); }
   
   /**
    * setWidthInt - Mutator to change the width of the rectangle to an int value
    * @param _width - the new value of width
    */
   public void setWidthInt(int _width) { setRect(this.getX(), this.getY(), _width, this.getHeight()); }
   
   /**
    * setHeightInt - Mutator to change the height of the rectangle to an int value
    * @param _height - the new value of height
    */
   public void setHeightInt(int _height) { setRect(this.getX(), this.getY(), this.getWidth(), _height); }
   
   /**
    * setColor - Mutator to change the color of the rectangle 
    * @param _color - the new color
    */
   public void setColor(Color _color) { color = _color; }
   
   /**
    * setFill - Mutator to change the fill flag of the rectangle 
    * @param _fill - the new value of the fill flag
    */
   public void setFill(boolean _fill) { fill = _fill; }
}
