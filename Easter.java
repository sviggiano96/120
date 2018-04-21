import java.util.Scanner;
/*
*Sherry Viggiano
*ISTE 120-02
*Lab 6 ex3
*/

 public class Easter {
 
 //Attributes according to the day of month and given year
 int a,b,c,d,e,g,h,j,k,m,r,n,p,y;
 
 public Easter(int y)
 {
   this.y = y;
   a = y % 19;
   b = y / 100;
   c = y % 100;
   d = b / 4;
   e = b % 4;
   g = (8 * b + 13) / 25;
   h = (19 * a + b - d - g + 15) % 30;
   j = c / 4;
   k = c % 4;
   m = (a + 11 * h) / 319;
   r = (2 * e + 2 * j - k - h + m + 32) % 7;
   n = (h - m + r + 90) / 25;
   p = (h - m + r + n + 19) % 32;
 }
 
 public double getEasterSundayMonth()
 {
   return n;
 }
 
 public double getEasterSundayDay()
 {
   return p;
 }
   
   
 }