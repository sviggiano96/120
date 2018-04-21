import java.util.Scanner;
/* Sherry Viggiano
 * ISTE-120-02-2175 
 * Lab 03 
 * calculator Exercise 3 Quiz Calculator
 */
 
 
public class QuizCalculator {

    
/*   private double accumulator;  //varialbe this initializes it to zero*/
   public String stuName;  
   private double sumOfQuiz; // Grand total of Quiz scores
   private double totalQuiz; // total number of quizzes taken
   private double average;  
   
    /**
     * Constructor for objects of class Calculator
     */
   public QuizCalculator(String _stuName)
   {
     // variables for class       
      stuName = _stuName;
      sumOfQuiz = 0;
      totalQuiz = 0;
      int average;
         
       
   }
   //Method #1 addScore  -- SumofQuiz + Quiz = sumofquiz
    public void addScore(double newScore)
   {
      sumOfQuiz = sumOfQuiz + newScore;
      totalQuiz++;      //can also do totalQuiz = totalQuiz +1;
      //System.out.print(sumOfQuiz());
   
   }
   // Method #2 public getAverage
      public double getAverage()
   {
      average = sumOfQuiz / totalQuiz;
      return average;
   }

   // Method #3 public String to String()
     public String toString()
     {
     return "" + stuName + " quiz average is :" + String.format("%6.2f", getAverage());
     }
     
}