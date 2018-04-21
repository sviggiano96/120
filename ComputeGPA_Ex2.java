/* 
 * Sherry Viggiano
 * ISTE 120-02
 * Lab 8 Ex 2
 * 04/01/18 
 */


 import java.util.*;
 
 public class ComputeGPA {
 
 public static void main(String[] args) {
 //number of courses
 int courses = 3;
 
 Scanner sc = new Scanner(System.in);
 
 GPA gpa1 = new GPA ();
 //while loop
 while (courses > 0){
   System.out.println("\nEnter grade (one character): ");
   String grade = sc.next();
   System.out.println("Enter credits: ");
   int credits = sc.nextInt();
   char letter = grade.charAt(0);
   gpa1.addToTotals(letter, credits);
   System.out.printf("Sum Points: %2d Sum Credits: %2d", gpa1.getSumWeightedPoints(), gpa1.getSumCredits());   
   courses --;
 }
    
    System.out.printf("\nGPA : %.2f", gpa1.getCalcGPA());
  }
 }