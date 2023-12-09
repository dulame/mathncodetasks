package tasks;

public class SchoolRunner {
    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass();

        schoolClass.addStudent(new SchoolClass.Student("Alex", 10));
        schoolClass.addStudent(new SchoolClass.Student("Ace", 11));
        schoolClass.addStudent(new SchoolClass.Student("Jaden", 10));

        schoolClass.removeStudentByNameAndGrade("Ace", 11);

        schoolClass.printStudents();
    }
}
