import java.util.*;

public class Report3
{
      /*String stuName;
      int idNumber;
      int grade1;
      int grade2;
      int grade3;
      double average;*/
   
      // Student student1 = new Student("Gabe");
//       Student student2 = new Student();
//       Student student3 = new Student();
      
      public static void main(String[] args)
      {
         new Report3(); // Creates the Report 3 object ***********
      }
         public Report3()
         {
         Scanner scan = new Scanner(System.in);
         
         // Student1 **********************
         System.out.print("Enter the Students full name: "); //enter students name
         String stuName = scan.nextLine();   //goto nextline
         
         System.out.print("Enter the Student's ID number: ");
         int idNumber = scan.nextInt();
         Student student1 = new Student(stuName, idNumber);

         System.out.print("Enter the Student's quiz 1 grade: ");
          student1.addGrade(scan.nextInt());
          
        /*  int grade1 = scan.nextInt();
          student1.addGrade(grade1);   the above line puts two lines of code into one This is the other way to do it.*/
         System.out.print("Enter the Student's quiz 2 grade: ");
         student1.addGrade(scan.nextInt());

         System.out.print("Enter the Student's quiz 3 grade: ");
         student1.addGrade(scan.nextInt());
      // Student 2 ************

      scan.nextLine(); //clears the line
      
         System.out.print("Enter the Students full name: "); //enter students name
         stuName = scan.nextLine();   //goto nextline
         
         System.out.print("Enter the Student's ID number: ");
         idNumber = scan.nextInt();
         Student student2 = new Student(stuName, idNumber);

         System.out.print("Enter the Student's quiz 1 grade: ");
          student2.addGrade(scan.nextInt());
          
        /*  int grade1 = scan.nextInt();
          student1.addGrade(grade1);   the above line puts two lines of code into one */
         System.out.print("Enter the Student's quiz 2 grade: ");
         student2.addGrade(scan.nextInt());

         System.out.print("Enter the Student's quiz 3 grade: ");
         student2.addGrade(scan.nextInt());

   // Student 3 *****   
   
   
      scan.nextLine(); //clears the line
      
         System.out.print("Enter the Student's full name: "); //enter students name
         stuName = scan.nextLine();   //goto nextline
         
         System.out.print("Enter the Student's ID number: ");
         idNumber = scan.nextInt();
         Student student3 = new Student(stuName, idNumber);

         System.out.print("Enter the Student's quiz 1 grade: ");
          student3.addGrade(scan.nextInt());
          
        /*  int grade1 = scan.nextInt();
          student1.addGrade(grade1);   the above line puts two lines of code into one */
         System.out.print("Enter the Student's quiz 2 grade: ");
         student3.addGrade(scan.nextInt());

         System.out.print("Enter the Student's quiz 3 grade: ");
         student3.addGrade(scan.nextInt());
         
System.out.println("Student1:\n " + student1.toString());
         
         System.out.println("Student2:\n " + student2.toString());
         
         System.out.println("Student3:\n " + student3.toString());
         
         System.out.println(student1.toString2());
           System.out.println(student2.toString2());
             System.out.println(student3.toString2());
            

    }     
         


         // System.out.println("Enter the Students ID number: ");
//          int idNumber = scan.nextInt(student1);
//          scan.nextLine(student1);


     




}