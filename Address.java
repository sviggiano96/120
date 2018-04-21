/**
 * Sherry Viggiano
 * 120-01-2175
 * Lab 04 exercise 1-2
 */

public class Address {
	// attributes of a Address
   private String street;
   private String city;
   private String state;
   private int zip; 
   public Student studentStu;
   public Address addressAddr;
   private String firstName;
	private String lastName;
	private int studentId;
	private double gpa;

    
   
   
   public Address(String _street, String _city, String _state, int _zip) {
     
     
      street = _street;
      city = _city;
      state = _state;
      zip = _zip; 
   }
    public  void Student(String _fName, String _lName, int _id, double _gpa) {
		firstName = _fName;
		lastName = _lName;
		studentId = _id;
		gpa = _gpa;
      	}
  
   
   
      public String toString(String studentStu, String addressAddr)
      {
         return String.format(studentStu.toString() + "\n" + addressAddr.toString());
          
	
            
        
      
      }
   
   /**
    * getStreetName - Accessor for 
    * @return the 
        */
   public String getStreetName() {
      return street;
   }
   
   /**
    * getLastName - Accessor for last name
    * @return the student's last name
    */
   public String getCityName() {
      return city;
   }
   
   /**
    * getStateName - Accessor for 
    * @return the student's ID
    */
   public String getStateName() {
      return state;
   }
   
   /**
    * getGpa - Accessor for gpa
    * @return the student's gpa
    */
   public int getZip() {
      return zip;
   }

   /**
    * setFirstName - Mutator for first name
    * @param the new first name
    */
   public void setStreetAddress(String _street) {
      street = _street;
   }
   
   /**
    * setLastName - Mutator for last name
    * @param the new last name
    */
   public void setCityName(String _city) {
      city = _city;
   }
   
   /**
    * setStudentId - Mutator for ID
    * @param the new ID
    */
   public void setStateName(String _state) {
      state = _state;
   }
   
   /**
    * setGpa - Mutator for gpa
    * @param the new gpa
    */
   public void setZipCode(int _zip) {
      zip = _zip;
   }
   
 public String toString() {
   
      return street + " " + "\n" +  city + ", "  + state + " " + zip; // +String.format("%6.1f",getGpa());
   }

   
   /**
    * getFirstName - Accessor for first name
    * @return the student's first name
    */
 	public String getFirstName() {
		return firstName;
	}
   
   /**
    * getLastName - Accessor for last name
    * @return the student's last name
    */
	public String getLastName() {
		return lastName;
	}
   
   /**
    * getId - Accessor for ID
    * @return the student's ID
    */
	public int getStudentId() {
		return studentId;
	}
   
   /**
    * getGpa - Accessor for gpa
    * @return the student's gpa
    */
	public double getGpa() {
		return gpa;
	}

   /**
    * setFirstName - Mutator for first name
    * @param the new first name
    */
	public void setFirstName(String _fName) {
		firstName = _fName;
	}
   
   /**
    * setLastName - Mutator for last name
    * @param the new last name
    */
	public void setLastName(String _lastName) {
		lastName = _lastName;
	}
   
   /**
    * setStudentId - Mutator for ID
    * @param the new ID
    */
	public void setStudentId(int _id) {
		studentId = _id;
	}
   
   /**
    * setGpa - Mutator for gpa
    * @param the new gpa
    */
	public void setGpa(double _gpa) {
		gpa = _gpa;
	}
   
   /*public String toString() {
   
      return lastName + ", " + firstName + "\n" +  "ID: " + studentId + " "  + "GPA: " +String.format("%6.1f",getGpa());
   }*/
   }



   
   
   


