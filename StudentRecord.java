/**
 * Sherry Viggiano
 * 120-01-2175
 * Lab 04 Section4 Implementing Classes
 */
public class StudentRecord
{
   //attributes
   public Student stu;
   public Address addr;
   
   
     // 1st constructor w/ student and address object
   public StudentRecord(Student stu, Address addr)
   {
     this.stu = stu;
     this.addr = addr; 
   }
   //constructor w/
   public StudentRecord(String fName, String lName, int id, double gpa, String street, String city, String state, int zip)
   {
        Student student = new Student(fName,lName, id, gpa);
        Address address = new Address(street, city, state, zip); 
        stu = student;
        addr = address;

   } 
   
   public String toString()
   {
      return String.format(stu.toString() + "\n" + addr.toString() + "\n");

    }   
}


