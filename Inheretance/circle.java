
class Circle1 {
    int radius;

    public double area() {
        return 2 * Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylender extends Circle1 {
    int height;

    public double volume() {
        return area() * height;
    }

}

public class circle {
    public static void main(String[] args) {
        Cylender c = new Cylender();

        c.radius = 10;
        c.height = 10;

        System.out.println(c.area());
        System.out.println(c.perimeter());
    }

}
