package activity2;
public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrollementCount = 0;

    static String schoolName = "University of Sea Side Village";

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];

    }

    public void enrollStudent(Student student) {
        if (enrollementCount < enrolledStudents.length) {
            enrolledStudents[enrollementCount] = student;
            enrollementCount++;
        } else {
            System.out.println("Course is full");
        }

    }

    public void displayCourseInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title" + courseTitle);
        System.out.println("Enrolled Students");

        for (int i = 0; i < enrollementCount; i++) {
        enrolledStudents[i].studentInfo();
        System.out.println("\n");
    }

        
    }
    


    public static String getSchoolName(){
        return schoolName;
    }

}