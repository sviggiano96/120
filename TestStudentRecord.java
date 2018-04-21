/**
 * Sherry Viggiano
 * 120-01-2175
 * Lab 04 Section4 Implementing Classes
 */
public class TestStudentRecord
{
   
      public static void main(String[] args) {
      Student sturec1 = new Student("Barbara", "BlueStone", 23686, 2.8);
      Address addr1 = new Address("Main St", "Any Town", "NY", 14539);
     StudentRecord stu1 = new StudentRecord(sturec1, addr1);
     //"Barbara", "BlueStone", 23686, 2.8, "Main St" , "Any Town", "NY", 14539);
     System.out.println(stu1.toString());
 
 
      //Student sturec2 = newStudent();
      //Address addr2 = new Address("Matthew", "Broderick", 39872, 3.5, "34 Worsted Pl", "NoPlaceVille", "UT", 29873);
      StudentRecord stu2 = new StudentRecord("Matthew", "Broderick", 39872, 3.5, "34 Worsted Pl", "NoPlaceVille", "UT", 29873);
      System.out.println(stu2.toString());
      }

 


}

