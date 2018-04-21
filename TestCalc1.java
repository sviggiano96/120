import java.util.Scanner;
/* Sherry Viggiano
 * ISTE-120-02-217 
 * Lab 03 
 * calculator
 */
 
 
public class TestCalc1 {

   public static void main(String[] args) {
   
      //https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
      Scanner scan = new Scanner(System.in);
      Calculator myCalc = new Calculator();
      
                  
      double myWeight = 202; // instead of 145 use your weight in pounds
      double myPie = 22;
      double nyPopulation = 19500000; 
       
      myCalc.add(myWeight);
      myCalc.multiply(0.453952); // convert weight to KG
      System.out.println("My weight is " + myWeight + "lb = " + myCalc.getAccumulator() + "kg");


    myCalc.divide(0); 
    System.out.println("My weight is " + myWeight + "lb = " + myCalc.getAccumulator() + "kg" );

    myCalc.divide(5);
    System.out.println("My weight is " + myWeight + "lb = " + myCalc.getAccumulator() + "kg");

    myCalc.add(myWeight);
    myCalc.add(2);
    System.out.println("My weight is " + myWeight + "lb = " + myCalc.getAccumulator() + "kg");

    myCalc.add(myWeight);
    myCalc.subtract(50);
    System.out.println("My weight is " + myWeight + "lb = " + myCalc.getAccumulator() + "kg"); 

    myCalc.setAccumulator();
    myCalc.add(myPie);
    myCalc.divide(7);    
    System.out.println("Pie is approximately " + myCalc.getAccumulator());   
    myCalc.setAccumulator();
    
    
    myCalc.add(nyPopulation);  
    myCalc.divide(54556);
    System.out.println("The Population of NY State is 19,378,102, the population density is "  + myCalc.getAccumulator() + "per square mile"); 
    myCalc.setAccumulator();
     
    Calculator numerator = new Calculator();
    numerator.add(4); //y2
    numerator.subtract(2); // y1 num now holds ys
    
    Calculator denominator = new Calculator();
    denominator.add(4); //x2
    denominator.subtract(2); // x1 den now holds xs
    
    numerator.divide(denominator.getAccumulator()); // divide the den into the num
   System.out.println("The slope is: " + numerator.getAccumulator());
     numerator.setAccumulator();
     denominator.setAccumulator();

     
    
   numerator.add(4); //y2
    numerator.subtract(2); // y1 num now holds ys
        
    denominator.add(0); //x2
    denominator.subtract(2); // x1 den now holds xs
    
    numerator.divide(denominator.getAccumulator()); // divide the den into the num
    System.out.println("The slope is: " + numerator.getAccumulator());
    numerator.setAccumulator();
    denominator.setAccumulator(); 
    
    numerator.add(2); //y2
    numerator.subtract(3); // y1 num now holds ys
        
    denominator.add(5); //x2
    denominator.subtract(2); // x1 den now holds xs
    
    numerator.divide(denominator.getAccumulator()); // divide the den into the num
    System.out.println("The slope is: " + numerator.getAccumulator());
    numerator.setAccumulator(); 
    denominator.setAccumulator();
    
      
       

   }    
      
      
               
}

