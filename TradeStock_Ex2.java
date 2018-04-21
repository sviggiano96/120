import java.util.Scanner;
/*
Course: ISTE-120
Author: Jim Leone, Rayno Niemi
Day 21 Decisions
Topic: Lab 07 Ex 1
*/
public class TradeStock  {
	public static void main(String[] args)	{
		//declarations
		Scanner in = new Scanner(System.in);
		String name = "";	//Name of stock
		String symbol = "";	//Symbol of stock
		double price = 0;	//price per share of stock
		int    shares = 0;	//number of shares of stock
		
		//Get name and symbol
		System.out.print("Enter name of stock: ");
		name = in.nextLine( );
      
      Stock myStock = new Stock();
      
      if (myStock.setName(name) == true)
      {
         System.out.print("Enter symbol of stock: ");
		   symbol = in.nextLine( );
      }
      
           
      else 
      {
         System.out.print("Invalid name - Must have at least one character");
         System.exit(0);
      }
      
      if (myStock.setSymbol(symbol) == true)
      {
         System.out.print("Enter price of stock: ");
		   price = in.nextDouble( );
      }
      
      else 
      {
         System.out.print("Invalid Symbol - Must be between 3 and 6 charcaters, inclusively");
         System.exit(0);
      }
      
      
      
      
      if (myStock.setPrice(price) == true)
      {
         
         System.out.print("Enter number of shares: ");
		   shares = in.nextInt( );
      }
		
		else 
      {
         System.out.print("Invalid Price - must be greater than 0");
         System.exit(0);  
      }
		
      if (myStock.setShares(shares) == true)
      {
      
      
      System.out.printf("%nName:   %s%n" ,myStock.getName());
		System.out.printf("Symbol: %s%n"  , myStock.getSymbol());
		System.out.printf("Price:  %.2f%n", myStock.getPrice());
		System.out.printf("Shares: %d%n"  , myStock.getShares());  
      }
		
      else 
      {
         System.out.print("Invalid Shares - Must be between 10 and 1000, inclusively and be multiple of 10.");
         System.exit(0);
      }
		
	}
}