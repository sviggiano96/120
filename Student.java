import java.util.*;

public class Student
{
String stuName;
int idNumber;
int numGrades;
int sumGrades;
int addGrade;
double average;
ArrayList<Integer> grades = new ArrayList<Integer>();

public Student(String stuName, int idNumber)
{
   
   this.stuName = stuName;
   this.idNumber = idNumber;
   int sumGrades = 0;
   int numGrades = 0;

}

public void addGrade(int newGrades)
{
   sumGrades = newGrades + sumGrades;
   grades.add(newGrades);
   numGrades++;
}

public double getAverage()
{
   average = sumGrades / numGrades;
   return average;
}

public String toString()
{ // \t adds a space
   return String.format("\tName: %-10s\n \tID: %-5d\n \tGrade1: %-7d\n \tGrade2: %-7d\n \tGrade3:%-7d\n ",stuName, idNumber, grades.get(0), grades.get(1), grades.get(2));
}
public String toString2()
{
   return String.format(" %-10s %5d %7.2f\n", stuName, idNumber, getAverage());
}
}