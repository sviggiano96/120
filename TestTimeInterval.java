/*
*
*ISTE 120-02
*Lab 6 ex1
*/


import java.util.Scanner;

public class TestTimeInterval{

   public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Please enter the first time: ");
      int time1 = scan.nextInt(); 
   
   System.out.print("Please enter the second time: ");
      int time2 = scan.nextInt();

//call methods
   TimeInterval testTime = new TimeInterval(time1, time2);
   
   testTime.getHours();
   testTime.getMinutes();
   testTime.getDecimalTime();
   
   System.out.print("Elaspsed time in hrs/min: " + testTime.getHours() + "hours " );   
   System.out.println(testTime.getMinutes() + "minutes");
   System.out.print("Elapsed time in decimal: " + testTime.getDecimalTime());
   
   
   
   }
   
}
