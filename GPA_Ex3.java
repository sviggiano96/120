/* 
 * Sherry Viggiano
 * ISTE 120-02
 * Lab 8 Ex 3
 * 04/01/18 
 */
 
  
public class GPA {
      //calling variables
   int sumCredits;
   int sumWeightedPoints;
      //constructor
   public GPA(char grade){
      char _grade = grade;
   }
      //constructor
   public GPA(){
      sumCredits = 0;
      sumWeightedPoints = 0;
   }
      //switch statement to change letter grade to int
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
         //mutator
   public int getSumCredits(){
      return sumCredits;
   }
         //mutator
   public int getSumWeightedPoints(){
      return sumWeightedPoints;
   }
         //calculate credits and weightedpoints
   public void addToTotals(char grade, int Credits){
      this.sumCredits = getSumCredits() + Credits;
      this.sumWeightedPoints = getSumWeightedPoints() + (calcPoints(grade) * Credits);
   }
         // calculate gpa
   public double getCalcGPA(){
      double GPA = (double) getSumWeightedPoints() / (double) getSumCredits();
      return GPA;
   }
    
}