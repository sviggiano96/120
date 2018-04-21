/* 
 * Sherry Viggiano
 * ISTE 120-02
 * Lab 8 Ex 1
 * 04/01/18 
 */
 
public class GPA {
   //gpa constructor
   public GPA(char grade){
     char _grade = grade;
   }
      //calcpoints SWITCH statement ****CHAR***in-- ****INT*** out
   public int calcPoints(char grade){
      switch (grade){
         case 'A':
            int points = 4; 
            return points;
      
         case 'a':
            points = 4;
            return points; 
            
         case 'B':
            points = 3; 
            return points;
            
         case 'b':
            points = 3; 
            return points;
            
         case 'C':
            points = 2; 
            return points;
            
         case 'c':
            points = 2; 
            return points;
            
         case 'D':
            points = 1; 
            return points;
            
         case 'd':
            points = 1; 
            return points;
            
         case 'F':
            points = 0; 
            return points;
            
         case 'f':
            points = 0; 
            return points;
            
         default: 
            return points = -1; 
      }
       
   } 
}