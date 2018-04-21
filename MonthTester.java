import java.util.Scanner;
/*
*
*ISTE 120-02
*Lab 6 ex2
*/


import java.util.Scanner;


public class MonthTester{




  public static void main(String[] args){
     int num;     
     String monthName = new String("JanuaryZZFebruaryZMarchZZZZAprilZZZZMayZZZZZZJuneZZZZZJulyZZZZZAugustZSeptemberOctoberZZNovemberZDecemberZ");
   
    //monthName = monthName.substring(start, end);

      Scanner scan = new Scanner(System.in);
   
      System.out.print("Enter the month number (1 - 12):");
      num = scan.nextInt();

            
      monthName.getSubstring(num);      
      new Month();

 
}
}
