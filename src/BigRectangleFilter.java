import java.awt.*;

public class BigRectangleFilter implements Filter{
    public boolean accept(Object x) {
        Rectangle r = (Rectangle) x;
        double perimeter = 2 * (r.width + r.height);
        return perimeter > 10;
    }
}
