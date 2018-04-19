import java.awt.geom.*;
import java.awt.*;

/**
 * Simple wrapper class to wrap a 2D Ellipse with two identical radii
 * Such an ellipse is a circle.
 */
public class Circle extends Ellipse2D.Double {
   private Color color = Color.BLACK;
   private boolean fill = false;
   /** 
    * Circle - constructor - uses ellipse constructor and radius as height and width
    * @param _x the x position of the upper left corner of the enclosing box
    * @param _y the y position of the upper left corner of the enclosing box
    * @param _radius the radius of the circle ... used as height and width of the ellipse
    */
   public Circle(int _x, int _y, int _radius) {
      super((double) _x, (double) _y, (double) (_radius*2), (double) (_radius*2));
   }
   
   /** 
    * Circle - constructor - uses ellipse constructor and radius as height and width
    * Allows the user to choose a color other than black.
    * @param _x the x position of the upper left corner of the enclosing box
    * @param _y the y position of the upper left corner of the enclosing box
    * @param _radius the radius of the circle ... used as height and width of the ellipse
    * @param _color the color to use to draw the circle
    */
   public Circle(int _x, int _y, int _radius, Color _color) {
      super((double) _x, (double) _y, (double) (_radius*2), (double) (_radius*2));
      color = _color;
   }
   
   /** 
    * Circle - constructor - uses ellipse constructor and radius as height and width. Allows user
    * to specify to fill the circle.
    * @param _x the x position of the upper left corner of the enclosing box
    * @param _y the y position of the upper left corner of the enclosing box
    * @param _radius the radius of the circle ... used as height and width of the ellipse
    * @param _fill boolean fill flag for the circle ... true means draw the circle filled
    */
   public Circle(int _x, int _y, int _radius, boolean _fill) {
      super((double) _x, (double) _y, (double) (_radius*2), (double) (_radius*2));
      fill = _fill;
   }
   
   /** 
    * Circle - constructor - uses ellipse constructor and radius as height and width. Allows user
    * to specify to fill the circle. Also allows the user to specify the color for drawing and
    * filling.
    * @param _x the x position of the upper left corner of the enclosing box
    * @param _y the y position of the upper left corner of the enclosing box
    * @param _radius the radius of the circle ... used as height and width of the ellipse
    * @param _color the color to use for drawing and filling.
    * @param _fill boolean fill flag for the circle ... true means draw the circle filled
    */
   public Circle(int _x, int _y, int _radius, Color _color, boolean _fill) {
      super((double) _x, (double) _y, (double) (_radius*2), (double) (_radius*2));
      fill = _fill;
      color = _color;
   }
   
   /**
    * toString - string representation of a Circle
    * @return a string representation in the form: Circle[x=xvalue,y=yvalue,radius=radiusvalue]
    */
   public String toString() {
      return this.getClass().getName() + "[x=" + ((int)getX()) + ",y=" + ((int)getY()) 
         + ",radius=" + ((int)(getHeight()/2.0)) + "color=" + getColor() + ",fill=" + getFill() + "]";
   }
   
   /**
    * getXInt - accessor for the x position of the circle, returned as an int. The underlying
    * class represents x as a double
    * @return x position of the circle as an int
    */
   public int getXInt() { return (int) super.getX(); }
   
   /**
    * getYInt - accessor for the y position of the circle, returned as an int. The underlying
    * class repressents y as a double.
    * @return y position of the circle as an int
    */
   public int getYInt() { return (int) super.getY(); }
   
   /**
    * getRadius - accessor for the radius of the circle, returned as an int. The underlying class
    * represents a circle as a special case of an ellipse, where the width and height are equal.
    * The width and height in this underlying class are doubles.
    * @return radius of the circle as an int
    */
   public int getRadius() { return (int) (super.getWidth()/2.0); }
   
   /**
    * getColor - accessor for the drawing color for the circle 
    * @return color for drawing the circle
    */
   public Color getColor() { return color; }
   
   /**
    * getFill - accessor for the fill flag for the circle ... true means fill the circle
    * @return fill flag for the circle
    */
   public boolean getFill() { return fill; }
   
   /**
    * setXInt - Mutator to change the x position of the circle to an int value
    * @param _x the new value of x
    */
   public void setXInt(int _x) { setFrame(_x, this.getY(), this.getWidth(), this.getHeight()); }
   
   /**
    * setYInt - Mutator to change the y position of the circle to an int value
    * @param _y the new value of y
    */
   public void setYInt(int _y) { setFrame(this.getX(), _y, this.getWidth(), this.getHeight()); }
   
   /**
    * setRadiusInt - Mutator to change the radius of the circle to an int value
    * @param _radius the new value of radius
    */
   public void setRadiusInt(int _radius) { setFrame(this.getX(), this.getY(), _radius*2.0, _radius*2.0); }
   
   /**
    * setColor - Mutator to change the color for drawing the circle 
    * @param _color the new color
    */
   public void setColor(Color _color) { color  = _color; }
   
   /**
    * setFill - Mutator to change the fill flag of the circle 
    * @param _fill the new value of the fill flag
    */
   public void setFill(boolean _fill) { fill = _fill; }
}