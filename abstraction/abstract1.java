// package abstraction;

abstract class Shape {
    abstract public double perimeter();

    abstract public double area();

}

class Circle extends Shape {
    double radius;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }

}

public class abstract1 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 10;
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;

        // Shape s = c;
        // System.out.print(s.area());

        Shape t = r;
        System.out.println(t.perimeter());
        System.out.println(t.area());

    }

}
