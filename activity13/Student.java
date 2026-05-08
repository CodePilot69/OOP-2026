class Student {
    String name;
    public Student(String name) { this.name = name; }
    @Override
    public String toString() { return "Student Name " + name; }
}

public class Main {
    public static void main(String[] args) {
        Repository<String> guestRepo = new Repository<>();
        guestRepo.add("KAltik");
        guestRepo.add("Yobab");
        guestRepo.add("baks");

        System.out.println("Total guestss: " + guestRepo.size());

        Repository<Student> studentRepo = new Repository<>();
        studentRepo.add(new Student("David"));
        studentRepo.add(new Student("Eve"));

        Student retrieved = studentRepo.get(0);
        Result<Student> result = new Result<>(retrieved, "Load sumaksespul ", true);

        result.display();
    }
}