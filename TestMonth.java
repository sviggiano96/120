import java.util.Scanner;
/*
*Sherry Viggiano
*ISTE 120-02
*Lab 6 ex2
*/

import java.util.*;

public class TestMonth {

   public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the month number (1-12): ");
   int mo = sc.nextInt();

   Month newmonth = new Month(mo);
   
   System.out.printf("The month is: %s", newmonth.getName());
   
   
   }
  } 
