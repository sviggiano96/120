/*
*
*ISTE 120-02
*Lab 6 ex2
*/


import java.util.Scanner;


public class Month{


   public Month (){
   int month = category;
   January = 1;
   February = 2;
   March = 3;
   April = 4;
   May = 5;
   June = 6;
   July = 7;
   August = 8;
   September = 9;
   October = 10;
   November = 11;
   December = 12;
      
   }
//   category = int month
   switch (category)
   {
      case 12:
         System.out.println ("December");
         break;
      case 11:
         System.out.println ("November");
         break;   
      case 10:
         System.out.println ("October");
         break;
      case 9:
         System.out.println ("September");
         break;
      case 8:
         System.out.println ("August");
         break;
      case 7:
         System.out.println ("JulY");
         break;
      case 6:
         System.out.println ("June");
         break;                
      case 5:
         System.out.println ("May");
         break;    
      case 4:
         System.out.println ("April");
         break;
      case 3:
         System.out.println ("March");
         break;
      case 2:   
         System.out.println ("February");
         break;
      case 1:
         System.out.println ("January");
         break; 
       default: 
       System.out.println("Sorry that is not a month.");
           
   }
   
   public int getName(){
      category = _month;
      return name;
   }
   

}
}
