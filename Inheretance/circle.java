// Inheritance is an important pillar of OOP(Object-Oriented Programming).It is the mechanism in java by which one
// class is
// allowed to
// inherit the

// features(fields and methods) of another class. In Java, inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.  

// supper class or base class...or parent class...
class Circle1 {
    int radius;

    public double area() {
        return 2 * Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// subClass or deriveClass or child class....
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
