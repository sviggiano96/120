/*
 * Sherry Viggiano
 * ISTE 120-03
 * Lab 9 Ex 1
 * 4/2/2018
 */
import java.util.*;

 public class Course
 {
   int credits; //An integer
   String grade; //A String 
   
   public Course(int _credits, String _grade)//Constructor 
   {
      this.credits = _credits;
      this.grade = _grade;
   }
   
   public String getGrade()//No returns value of  grade
   {
      return grade;
   }
   
   public double getCredits()////No  returns value of 
   {
      return credits;
   }
 }