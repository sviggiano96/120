import java.util.Scanner;
public class TestCalc2{

public static void main(String [] args) {//start m

int nbr1, nbr2, nbr3, nbr4, avg;

System.out.print("Enter a number to average: ");
nbr1 = strToInt();
System.out.print("Enter a number to average: ");
nbr2 = strToInt();
System.out.print("Enter a number to average: ");
nbr3 = strToInt();
System.out.print("Enter a number to average: ");
nbr4 = strToInt();
avg = average(nbr1, nbr2);
System.out.println("The average of the first two numbers is: " + avg);
avg = average(nbr1, nbr2, nbr3);
System.out.println("The average of the first three numbers is: " + avg);
avg = average(nbr1, nbr2, nbr3, nbr4);
System.out.println("The average of the four numbers is: " + avg);
}
//

public static int average(int a, int b){ //1st method
return (a + b)/2;
}

public static int average(int a, int b, int c){ //2nd method
return (a + b + c)/3;
}

public static int average(int a, int b, int c, int d){ //3rd method
return (a + b + c + d)/4;
}

public static int strToInt(){ //Read in as a string and then convert it to integer
Scanner scan = new Scanner(System.in);
int error = 1;
int nbr = 0;

do {
System.out.print("Please Enter an integer: ");
String svalue =(scan.next());

try
{
// the String to int conversion is attempted here
int i = Integer.parseInt(svalue.trim());

// print out the value after the conversion
System.out.println("int i = " + i);
nbr = i;
error = 0;
}
catch (NumberFormatException nfe)
{
System.out.println("Invalid entry.");
}
}
while (error == 1);

return nbr;
}


}



