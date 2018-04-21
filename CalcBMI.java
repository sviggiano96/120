import java.util.Scanner;
/* Sherry Viggiano
 * ISTE-120-02-2175 
 * Lab 03 
 * calculator Exercise 2
 */
 
 
public class CalcBMI {

   public static void main(String[] args) {
   double myWeight = 150;
   double bmiCalc = 703;
   double myHeight = 60; //
      //https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
      Scanner scan = new Scanner(System.in);
 
    Calculator numerator = new Calculator();
    numerator.add(bmiCalc); // adds the calculation number
    numerator.multiply(myWeight); // adds the height,  num now holds ys
    
    Calculator denominator = new Calculator();
    denominator.add(myHeight); //adds the height
    denominator.multiply(myHeight);
    
    
    numerator.divide(denominator.getAccumulator()); // divide the den into the num
   System.out.println("Your BMI is: " + numerator.getAccumulator());
     numerator.setAccumulator();
     denominator.setAccumulator();
     }
     
     }