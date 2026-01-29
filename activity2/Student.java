package activity2;
    public class Student {
    String firstName;
    String middleName;
    String lastName;
    String Gender;
    String Email;
    int StudentId;

    public static int totalStudent = 0;
   
    public Student(String Firstname, String Middlename, String Lastname, String Gender, String Email, int StudentId){
        
        this.firstName = Firstname;
        this.middleName = Middlename;
        this.lastName = Lastname;
        this.Gender = Gender;
        this.Email = Email;
        this.StudentId = StudentId;  
        totalStudent++;


    }

    public void studentInfo(){
        System.out.println("Student ID" + StudentId);
        System.out.println("Name: " + firstName +  middleName + lastName);
        System.out.println("Student Gender: " + Gender);
        System.out.println("Student Email " + Email);

        
    }
       
  
}