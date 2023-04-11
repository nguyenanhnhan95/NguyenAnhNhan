package ss7_abstract_interface.bai_tap.resizeable;

import ss7_abstract_interface.bai_tap.resizeable.Shape;
import ss7_abstract_interface.bai_tap.resizeable.Circle;
import ss7_abstract_interface.bai_tap.resizeable.Rectangle;
import ss7_abstract_interface.bai_tap.resizeable.IResizeable;

public class MainTest {
    public static void main(String[] args) {
        Square square = new Square(5, 4, true, "blue");
        square.resize(30);
        Rectangle rectangle = new Rectangle(3, 6, true, "red");
        rectangle.resize(30);
        Circle circle = new Circle(5, "yellow", true);
        circle.resize(30);
        Shape[] shapes = new Shape[]{square, rectangle, circle};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
