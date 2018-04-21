import java.util.Scanner;
/*
*Sherry Viggiano
*ISTE 120-02
*Lab 6 ex2
*/



 public class Month {
 
 int mo;
 int Start = 0;
 int Stop = 0;
 
 public Month(int _mo)
 {
 this.mo = _mo;
 }
 
 public String getName()
 {
  String months = ("January  February March    April    May      June     July     August   SeptemberOctober  November December ");
  this.mo = (mo-1) * 9;
  String month = months.substring(mo, (mo + 9));  
  return month;
 }
 
 
 
 }