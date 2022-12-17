class rectangle {
    int length;
    int breadth;

    // Constructor is the method of class which is authomatically called whenever
    // creating a Object..

    // types of constructor ..
    // there are two tyepes non parameterise constroctor , porameterise
    // constructor..
    // by default constructor is provide the compiler..
    public rectangle() {
        length = 0;
        breadth = 0;
        System.out.println(length);
        System.out.println(breadth);
    }

    // Parameterise constructor..
    public rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}

public class constructor {
    public static void main(String[] args) {

        rectangle r1 = new rectangle(10, 5);
        // rectangle r1 = new rectangle();

        System.out.println(r1.area());
    }
}
