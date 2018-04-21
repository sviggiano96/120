import java.awt.*;
import java.util.*;

/**
 * ISTE 120-01
 * Sherry Viggiano
 * 2/19/18
 * Lab 4 - exercise 2 simple animation
 *
 */




 public class Controller  {
 
        //attributes declared here
    Canvas canvas;
    Arrow arrow;
    
    
    

   
      public static void main(String[] args)
       throws Exception {
      new Controller();
               }              
              
      public Controller()
      throws Exception  {
         canvas = new Canvas("Arrow", 300, 700);
         canvas.setVisible(true);
         arrow = new Arrow(canvas);
         arrow.draw();// draw arrow at bottom of screen
         Thread.currentThread().sleep(100); // /delay a little
          
         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little
         
         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little


arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little


arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little


arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little

         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little
         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little
         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little
         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little
         arrow.erase(); //erase the arrow
         arrow.moveUp(); // move the arrow
         arrow.draw();// redraw 
         Thread.currentThread().sleep(100); //delay a little




         
       } 
       
     
         
 }      