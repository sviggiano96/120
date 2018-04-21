import java.util.Scanner;
/* Sherry Viggiano
 * ISTE-120-02-2175 
 * Lab 06 
 * Exercise 3 
 */
import java.util.*;
 
 public class EasterTester {
 
 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter year: ");
 int year = sc.nextInt();
 
 Easter test = new Easter(year);
 
 System.out.printf("Month: %.0f\n", test.getEasterSundayMonth());
 
 System.out.printf("Day: %.0f", test.getEasterSundayDay());
 
 }
}
 