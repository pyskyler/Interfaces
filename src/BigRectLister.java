import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        Rectangle r1 = new Rectangle(1, 1);
        Rectangle r2 = new Rectangle(2, 1);
        Rectangle r3 = new Rectangle(3, 1);
        Rectangle r4 = new Rectangle(4, 1);
        Rectangle r5 = new Rectangle(5, 1);
        Rectangle r6 = new Rectangle(6, 1);
        Rectangle r7 = new Rectangle(7, 1);
        Rectangle r8 = new Rectangle(8, 1);
        Rectangle r9 = new Rectangle(9, 1);
        Rectangle r10 = new Rectangle(10, 1);

        rectangles.add(r1);
        rectangles.add(r2);
        rectangles.add(r3);
        rectangles.add(r4);
        rectangles.add(r5);
        rectangles.add(r6);
        rectangles.add(r7);
        rectangles.add(r8);
        rectangles.add(r9);
        rectangles.add(r10);

        Filter filter = new BigRectangleFilter();

        System.out.println("Big Rectangles:");

        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                printRect(r);
            }
        }
    }

    private static void printRect(Rectangle r) {
        System.out.println("Rectangle: " + r.width + "x" + r.height);
    }
}
