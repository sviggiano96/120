/*
Course: ISTE-120
Author: Jim Leone, Rayno Niemi
Lab 10 Ex 1, Starter Code
Topic: 2-dim arrays
*/

import java.util.Scanner;
import java.util.Random;

public class GridPractice  {
   public static void main(String[] args)  {
   //declarations
      Scanner in = new Scanner(System.in);
      Random  generator = new Random();
      int [][] grid;	//un-instantiated grid
      int size = 0;	//number of rows and columns
      int sum = 0;
      int total = 0;
      int total1 = 0;
         
   //get size of grid - no validation & instantiate
      System.out.print("Enter size of grid: ");
      size = in.nextInt();
      grid = new int[size][size];
      System.out.println("\nRandom values assigned to 2 by 2 grid");
      int rowSize = grid.length;
      int columnSize = grid[0].length;
      int[] colSum = new int[grid[0].length];  
      

   
   //fill grid with random number from 1..99
      
      for (int row = 0; row<size; row++)  {
         for (int col = 0; col<size; col++)  {
            grid[row][col] = generator.nextInt(100); //random numbers 0.99 - not 100
            System.out.printf("%s ", grid[row][col]);
         }
         System.out.println();
      }
   
   //STEP 3(exercise 1):  print grid with formatting to align
      System.out.println("\nRow   Sum");
      System.out.println("---------");
      
      for (int i = 0; i < grid.length; i++)
      {   
         for (int j = 0; j < grid[i].length; j++)
         {                
               sum = sum + grid[i][j];
               
               colSum[j] += grid[i][j];
               
         }
         
     //STEP 4A (exercise 2): print each row sum      
         System.out.println(" "+ (i+0)+ "    " + sum);
         sum = 0;
      } 
      
      System.out.println("\nRow   Sum");
      System.out.println("---------"); 
      for(int k = 0;k < colSum.length; k++)
      {
     //STEP 4B (exercise 2): print each column sum
         System.out.println(" " + (k + 0)+ "    "  + colSum[k]);
      } 
     
      //STEP 5 (exercise 3): print two diagonal sums
      for (int f = 0; f < grid.length; f++)
      {
         total += grid[f][f];
         total1 += grid[f][grid.length - f - 1];
      }
      System.out.println("\nDiagonal from upper left to lower right is " + total);
      System.out.println("\nDiagonal from upper right to lower left is " + total1);
      
   } 
}    
      
      
      
 
  
   
   

