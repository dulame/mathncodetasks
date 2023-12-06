package task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(10);
        Car car = new Car(50);

        person.move(1000);
        car.move(2000);
    }
}
