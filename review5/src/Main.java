import shape.Rectangle;
import shape.Circle;
import shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);
        shapes[2] = new Triangle(6, 8);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}