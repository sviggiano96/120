import java.awt.geom.*;
import java.awt.*;

/**
 * Simple wrapper class to wrap a Polygon 
 */
import java.awt.Polygon;

public class Triangle extends Polygon {
   private int x;
   private int y;
   private int width;
   private int height;
   private boolean fill = false;
   private Color color = Color.BLACK;
   
   /** 
    * Triangle - constructor ... uses Polygon constructor. The (x,y) is the location
    * of the upper left corner of the bounding rectangle. width and height are the
    * size of the bounding rectangle. The color is BLACK. The fill flag is FALSE.
    * @param _x the x position of the upper left corner of the enclosing square
    * @param _y the y position of the upper left corner of the enclosing square
    * @param _width the width of the enclosing square
    * @param _height the height of the enclosing square
    */
   public Triangle(int _x, int _y, int _width, int _height) {
      super( new int[]{_x, _x+_width, _x+(int)(_width/2.0 + 0.5)}, new int[]{_y+_height, _y+_height, _y}, 3);
      x = _x;
      y = _y;
      width= _width;
      height = _height;
   }
   
   /** 
    * Triangle - constructor ... uses Polygon constructor. The (x,y) is the location
    * of the upper left corner of the bounding rectangle. width and height are the
    * size of the bounding rectangle. The color may be given. The fill flag is FALSE.
    * @param _x the x position of the upper left corner of the enclosing square
    * @param _y the y position of the upper left corner of the enclosing square
    * @param _width the width of the enclosing square
    * @param _height the height of the enclosing square
    * @param _color the color of the triangle
    */
   public Triangle(int _x, int _y, int _width, int _height, Color _color) {
      super( new int[]{_x, _x+_width, _x+(int)(_width/2.0 + 0.5)}, new int[]{_y+_height, _y+_height, _y}, 3);
      x = _x;
      y = _y;
      width= _width;
      height = _height;
      color = _color;
   }
   
   /** 
    * Triangle - constructor ... uses Polygon as superclass. The (x,y) is the location
    * of the upper left corner of the bounding rectangle. width and height are the
    * size of the bounding rectangle. The color is BLACK. The user can specify the fill flag.
    * @param _x the x position of the upper left corner of the enclosing square
    * @param _y the y position of the upper left corner of the enclosing square
    * @param _width the width of the enclosing square
    * @param _height the height of the enclosing square
    * @param _fill boolean fill flag for the circle ... true means draw the circle filled
    */
   public Triangle(int _x, int _y, int _width, int _height, boolean _fill) {
      super( new int[]{_x, _x+_width, _x+(int)(_width/2.0 + 0.5)}, new int[]{_y+_height, _y+_height, _y}, 3);
      x = _x;
      y = _y;
      width= _width;
      height = _height;
      fill = _fill;
   }
   
   /** 
    * Triangle - constructor ... uses Polygon as superclass. The (x,y) is the location
    * of the upper left corner of the bounding rectangle. width and height are the
    * size of the bounding rectangle. The user can specify the color. The user can specify the fill flag.
    * @param _x the x position of the upper left corner of the enclosing square
    * @param _y the y position of the upper left corner of the enclosing square
    * @param _width the width of the enclosing square
    * @param _height the height of the enclosing square
    * @param _color the color of the triangle
    * @param _fill boolean fill flag for the circle ... true means draw the circle filled
    */
   public Triangle(int _x, int _y, int _width, int _height, Color _color, boolean _fill) {
      super( new int[]{_x, _x+_width, _x+(int)(_width/2.0 + 0.5)}, new int[]{_y+_height, _y+_height, _y}, 3);
      x = _x;
      y = _y;
      width= _width;
      height = _height;
      fill = _fill;
      color = _color;
   }
   
   /**
    * toString - string representation of a Triangle
    * @return a string representation in the form: 
    *    Triangle[x=xvalue,y=yvalue,width=widthvalue,height=heightvalue,color=color,fill=fillvalue]
    */
   public String toString() {
      return this.getClass().getName() + "[x=" + getXInt() + ",y=" + getYInt() 
         + ",width=" + getWidthInt() + ",height=" + getHeightInt() + ",color=" + getColor() + ",fill=" + getFill() + "]";
   }
   
   /**
    * getXInt - accessor for the x position of the triangle, returned as an int. 
    * @return x position of the triangle as an int
    */
   public int getXInt() { return x; }
   
   /**
    * getYInt - accessor for the y position of the triangle, returned as an int.
    * @return y position of the triangle as an int
    */
   public int getYInt() { return y; }
   
   /**
    * getWidthInt - accessor for the width of the triangle, returned as an int. 
    * @return width of the triangle as an int
    */
   public int getWidthInt() { return width; }
   
   /**
    * getHeightInt - accessor for the height of the triangle, returned as an int. 
    * @return height of the triangle as an int
    */
   public int getHeightInt() { return height; }
   
   /**
    * getColor - accessor for the color of the triangle
    * @return color of the triangle
    */
   public Color getColor() { return color; }
   
   /**
    * getFill - accessor for the fill flag for the triangle ... true means fill the triangle
    * @return fill flag for the triangle
    */
   public boolean getFill() { return fill; }
   
   /**
    * setXInt - Mutator to change the x position of the triangle to an int value
    * @param _x the new value of x
    */
   public void setXInt(int _x) { 
      reset();
      x = _x;
      addPoint(x, y+height);
      addPoint(x+width, y+height);
      addPoint(x+(int)(width/2.0 + 0.5), y);
   }

   /**
    * setYInt - Mutator to change the y position of the triangle to an int value
    * @param _y the new value of y
    */
   public void setYInt(int _y) { 
      reset();
      y = _y;
      addPoint(x, y+height);
      addPoint(x+width, y+height);
      addPoint(x+(int)(width/2.0 + 0.5), y);
   }
   
   /**
    * setWidthInt - Mutator to change the width of the triangle to an int value
    * @param _width the new value of width
    */
   public void setWidthInt(int _width) {
      reset();
      width = _width;
      addPoint(x, y+height);
      addPoint(x+width, y+height);
      addPoint(x+(int)(width/2.0 + 0.5), y);
   }
   
   /**
    * setHeightInt - Mutator to change the height of the triangle to an int value
    * @param _height the new value of height
    */
   public void setHeightInt(int _height) {
      reset();
      height = _height;
      addPoint(x, y+height);
      addPoint(x+width, y+height);
      addPoint(x+(int)(width/2.0 + 0.5), y);
   } 
   
   /**
    * setColor - Mutator to change the color of the Triangle 
    * @param _color the new value of the color
    */
   public void setColor(Color _color) { color = _color; }
   
   /**
    * setFill - Mutator to change the fill flag of the triangle 
    * @param _fill the new value of the fill flag
    */
   public void setFill(boolean _fill) { fill = _fill; }
}