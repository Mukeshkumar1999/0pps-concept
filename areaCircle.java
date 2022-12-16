import java.util.function.DoubleUnaryOperator;

class circle {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public Double perimeter() {
        return 2 * (Math.PI * radius);
    }

    public boolean display() {
        if (radius >= 0) {
            return true;
        } else
            return false;
    }
}

public class areaCircle {

    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = -10.3;

        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.display());
    }
}
