/*
Course: ISTE-120
Author: Jim Leone, Rayno Niemi
Day 21 Decisions
Topic: Lab 07 Ex 1
*/
public class Stock  {
	private String name;		//name of company
	private String symbol;	//Symbol of company on Stock Exchange
	private double price;	//price per share
	private int    shares;	//number of shares
	
	/**
		Constructor with name and symbol
	*/
   
   public Stock(){
      this.name = "";
      this.symbol = "";
   }
   
   
	public Stock(String newName, String newSymbol)	{
		name   = newName;
		symbol = newSymbol;
		price  = 0.0;
		shares = 0;
	}
   
   //Add mutators
   public boolean setName(String name){
      
      if (name.length() > 0)
      {
       this.name = name;
       return true;
      } 
      return false;
   }
   
   public boolean setSymbol(String symbol){
   
       if (symbol.length() >=3 && symbol.length() <=6)
      {
         this.symbol = symbol;
         return true;
      }
         return false;
   }
   
	
	/**
		Get name of stock
		@return name of stock
	*/
	public String getName( )	{
		return name;
	}
	
	/**
		Get symbol of stock
		@return symbol of stock
	*/
	public String getSymbol( )	{
		return symbol;
	}
	
	/**
		Get price of stock
		@return price of stock
	*/
	public double getPrice( )	{
		return price;
	}
	
	/**
		Get number of shares
		@return number of shares
	*/
	public int getShares( )	{
		return shares;
	}
	
	/**
		Set price of shares
		@param newPrice price of shares
	*/
	public boolean setPrice(double newPrice)	{
		
      if (newPrice > 0.0) 
      {
         this.price = newPrice;
         return true;
      }
         return false;
	}
	
	/**
		Set number of shares
		@param newShares number of shares
	*/
	public boolean setShares(int newShares)	{
		
      if (newShares >=10 && shares <=1000 && shares % 10 == 0)
      {
        this.shares = newShares;
        return true;
	   }
        return false;
      
  }
}