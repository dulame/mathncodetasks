package tasks;

import java.util.ArrayList;

public class SchoolClass {
    private final ArrayList<Student> students;

    public SchoolClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentByNameAndGrade(String name, int grade) {
        for (Student student: students) {
            if (student.getName().equals(name) && grade == student.getGrade()) {
                students.remove(student);
                return;
            }
        }
    }

    public void printStudents() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public static class Student {
        private String name;
        private int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
