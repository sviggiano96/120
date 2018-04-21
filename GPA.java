/*
 * Sherry Viggiano
 * ISTE 120-03
 * Lab 9 Ex 1
 * 4/2/2018
 */
import java.util.*;

public class GPA 
{  
   //attributes
   //int[] credits;
   //String[] grades;
   int credits;
   String grades;
   int numCourses;
   int maxCourses;
   int sumOfCredits = 0;
   int sumOfPoints = 0;
   int grade;
       
  // public static final int numOfCourses = 4;
   ArrayList<Course> courseA = new ArrayList<Course>();
      //constructor
  //    store credit and letter grade
    
   
 public GPA(int _maxCourses){
      numCourses = 0;
      maxCourses = 0; 
      grades = "";
      maxCourses = _maxCourses;
      numCourses = 0;
   
   }
   
            
      
     
     
       public double calcGpa(){
      double sumCredits = 0;
      for (int i = 0; i < courseA.size(); i++){
         Course course2 = courseA.get(i);
         sumCredits = sumCredits + course2.getCredits();

      }  
      if(sumCredits != 0){
      
      double GPA = (double) sumOfPoints/sumCredits;
      return GPA;
      }
      return 0;
   }
   
   public void addCourse(int _credits, String _grade){
       Course course1 = new Course(_credits, _grade);
     courseA.add(course1);
    numCourses++;
    int grade = 0;
      
      
     
      switch (_grade)
      {
         case "A": grade = 4; 
            break;
         case "a": grade = 4; 
            break;
         case "B": grade = 3; 
            break;
         case "b": grade = 3; 
            break;
         case "C": grade = 2; 
            break;
         case "c": grade = 2; 
            break;
         case "D": grade = 1; 
            break;
         case "d": grade = 1; 
            break;
         case "F": grade = 0; 
            break;
         case "f": grade = 0; 
            break;       
      } // calculating points
      sumOfPoints = sumOfPoints + (_credits * grade);
      
    //  for (int x : credits)
     // {
    //     sumOfCredits += x;
    //  }
      
     // System.out.println("Total number of credits: " + sumOfCredits);
     // System.out.println("Total number of points: " + sumOfPoints);
         // calculating gpa - then print statement
    //  double GPA = (double) sumOfPoints/sumOfCredits; 
     // System.out.printf("GPA: %.2f", GPA);
     
   }
      
      //same as above
      
     /* for (int i = 0; i< credits.length; i++){
      int x = credits(i);
      sumCredits = total + x;
      }*/
      /*
      adding methods for EX2
      */
      
              //print statements
              
   
}
