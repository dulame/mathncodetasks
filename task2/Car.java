package task2;

public class Car implements Movable {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void move(int distance) {
        System.out.println("Moved " + distance + " with " + speed);
    }
}
