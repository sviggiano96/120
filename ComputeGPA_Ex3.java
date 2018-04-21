/* 
 * Sherry Viggiano
 * ISTE 120-02
 * Lab 8 Ex 3
 * 04/01/18 
 */ 
 
import java.util.*;
 
public class ComputeGPA {
 
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
         //user enters course int
      System.out.println("Enter number of courses: ");
      int courses = sc.nextInt();
            //while loop - grade int
      while (courses <= 0){
         System.out.println("Invalid number of courses - must be greater than 0");
         System.out.println("Enter number of courses: ");
         courses = sc.nextInt();
      }   
         //gpa created
      GPA gpa1 = new GPA ();
         //while loop - grade letters 
      while (courses > 0){
         System.out.println("Enter grade (one character): ");
         String grade = sc.next();
         char letter = grade.charAt(0);
           // bounce if -1
         while (gpa1.calcPoints(letter) == -1){
            System.out.println("Invalid grade - must enter A,B,C,D,F (upper or lower case)");
            System.out.println("Enter grade (one character): ");
            grade = sc.next();
            letter = grade.charAt(0);
             // bounce if length wrong
            while (grade.length() !=1){
               System.out.println("Invalid grade - must enter exactly one letter");
               System.out.println("Enter grade (one character): ");
               grade = sc.next();
               letter = grade.charAt(0);
            }
         }
         
        
         
               //asking for credit int
         System.out.println("Enter credits: ");
         int credits = sc.nextInt();
               //while loop credit int
         while (credits < 0 || credits > 9){
            System.out.println("Invalid credits = must be between 0 and 9, inclusively");
            System.out.println("Enter credits: ");
            credits = sc.nextInt();
         }
               // adding totals
         gpa1.addToTotals(letter, credits);   
         courses --;
      }
            //printing gpa calculation
      System.out.printf("\nGPA : %.2f", gpa1.getCalcGPA());
   }
}