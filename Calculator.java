import java.util.Scanner;
import java.lang.*;

/* Sherry Viggiano
 * ISTE-120-02-2175 
 * Lab 03 
 * calculator
 */


public class Calculator
{
    
   private double accumulator;  //varialbe this initializes it to zero
      
   
    /**
     * Constructor for objects of class Calculator
     */
   public Calculator()
   {
     //set accumulator to zero
      accumulator = 0;
         
       
   }

   public double getAccumulator()// Accessor returns a value
   {
      return accumulator;
         
   }
   
   public void add(double myAdd)
   { // adds the weight and stores in the accumulator
      accumulator = accumulator + myAdd;
         
   }
   
   public void subtract(double mySubtract)
   { // subtracts the weight and stores in the accumulator
      accumulator = accumulator - mySubtract;
   }
       
   public void divide(double myDivide)
   { // divide the weight and stores in the accumulator
       if (myDivide == 0)
       {
       System.out.println("Attempt to Divide by Zero - Ignored");
       }
       else
       
      accumulator = accumulator / myDivide;
   } 

          
      
   public void multiply(double myMultiply)
   { // multiply the weight and stores in the accumulator
      accumulator = accumulator * myMultiply;
   }
   
   public void setAccumulator()
   {
      accumulator = 0;
   }
          
   }
      
      
      
      
           

