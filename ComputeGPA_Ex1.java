/* 
 * Sherry Viggiano
 * ISTE 120-02
 * Lab 8 Ex 1
 * 04/01/18 
 */
 import java.util.*;
 
 public class ComputeGPA {
 
 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 
 while (true){
   System.out.println("Enter grade (one character): ");
   String grade = sc.next();
   char points = grade.charAt(0);
   GPA gpa1 = new GPA (points);
   System.out.println("Points: " + gpa1.calcPoints(points));
   
   }
  }
 }