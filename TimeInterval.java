/*
*
*ISTE 120-02
*Lab 6 ex1
*/


public class TimeInterval {


int time1totalmin;
int time2totalmin;



public TimeInterval (int _time1, int _time2){
   int time1 = _time1;
   int time2 = _time2;
   int time1hr = time1/100;
   int time1min = time1%100;
   int time2hr = time2/100;
   int time2min = time2%100;
   
   if (time1hr <00 || time1hr >24){
      System.err.println("Time is invalid.");
      System.exit(0);
      }
   else if (time1min < 00 || time1min > 59) {
      System.err.println("Time is invalid.");
      System.exit(0);
      }
   else if (time2hr < 00 || time2hr > 24) {
      System.err.println("Time is invalid.");
      System.exit(0);
      }
   else if (time2min < 00 || time2hr > 59) {
      System.err.println("Time is invalid.");
      System.exit(0);
      }
   time1totalmin=time1hr*60+time1min;
   time2totalmin=time2hr*60+time2min;   
}
// methods

public int getHours(){
   return Math.abs(time2totalmin - time1totalmin)/60;

}
public int getMinutes(){
   return Math.abs(time2totalmin - time1totalmin)%60;
}

public double getDecimalTime(){
   return (double) Math.abs(time2totalmin - time1totalmin)/60;
}


}
