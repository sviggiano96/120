import java.util.*;

/* Sherry Viggiano
 * ISTE-120-02-2175 
 * Lab 03 
 * calculator Exercise 3 Quiz Calculator
 */
 
 
public class TestQuizCalc {
   
  
   public static void main(String[] args) {
   
  // Scanner scan = new Scanner(Scanner.in);
   //Calculator 1
   QuizCalculator quiz = new QuizCalculator("William Johnson");
   quiz.addScore(92.5);
   quiz.addScore(92.5);
   System.out.println(quiz);
   
   //System.out.println(quiz.getAverage()); // "%6.2f" how to get this to accept the formating.
   
   QuizCalculator quiz2 = new QuizCalculator("John Hacker");
   quiz2.addScore(72);
   quiz2.addScore(60.5);
   quiz2.addScore(89.5);
   quiz2.addScore(92.5);
   
   System.out.println(quiz2);
   
   
   //System.out.println(quiz2.getAverage()); // "%6.2f" how to get this to accept the formating.
   
   QuizCalculator quiz3= new QuizCalculator("Susan Hackster");
   quiz3.addScore(95);
   quiz3.addScore(92.5);
   quiz3.addScore(98);
   quiz3.addScore(92.5);
   quiz3.addScore(99);            
   System.out.println(quiz3);
   
   
   //System.out.println(quiz3.getAverage()); // "%6.2f" how to get this to accept the formating.
   
   
   
   
   }
   }