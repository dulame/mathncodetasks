package task2;

public class Person implements Movable {
    private int walkingSpeed;

    public Person(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    @Override
    public void move(int distance) {
        System.out.println("Moved " + distance + " with " + walkingSpeed);
    }
}
