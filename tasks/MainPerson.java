package tasks;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Michael", 30);
        Person person2 = new Person("Thomas", 25);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1);
        System.out.println(person2);
    }
}
