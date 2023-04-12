package ss7_abstract_interface.bai_tap.colorable;

import ss7_abstract_interface.bai_tap.colorable.IColorable;
import ss7_abstract_interface.bai_tap.colorable.Shape;
import ss7_abstract_interface.bai_tap.colorable.Square;
import ss7_abstract_interface.bai_tap.colorable.Circle;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue", true);
        Square square = new Square(5, 7, true, "red");
        Shape[] shapes = new Shape[]{circle, square};
        for (Shape shape : shapes) {
            if (shape instanceof IColorable) {
                Square square1 = (Square) shape;
                System.out.println(square1);
                square1.howToColor();
            } else {
                System.out.println(shape);
            }
        }
    }
}
