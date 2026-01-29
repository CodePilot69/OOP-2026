package activity2;

public class Main {
    public static void main(String[] args) {

        
        System.out.println("Total Students: " + Student.totalStudent);

        
        Student s1 = new Student("Ira", " A.", " Palabay", " Male", " Ira@gmail.com",  101);
        Student s2 = new Student("Dabbed", " A.", " Palabay", " Male", " Dabbed@gmail.com",  102);
        Student s3 = new Student("jude", " A.", " Espiritu", " Male", " Jude@gmail.com",  103);

        
        System.out.println("Total Students after enrollment: " + Student.totalStudent);

        
        System.out.println("\nStudent Details:");
        s1.studentInfo();

        
        System.out.println("\nSchool Name: " + Course.getSchoolName());

        
        Course course = new Course("CS101", "Introduction to Programing");

        
        course.enrollStudent(s1);
        course.enrollStudent(s2);
        course.enrollStudent(s3);

        
        System.out.println("\nCourse Information:");
        course.displayCourseInfo();
    }
}
