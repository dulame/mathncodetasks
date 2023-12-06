package task2;

public class TestFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(4.3);
        Rectangle rectangle = new Rectangle(3.0, 5.3);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}
