// package LambdaExpresion;
@FunctionalInterface
interface Mylambda {
    public void display();
}

public class lambda {
    public static void main(String[] args) {
        Mylambda m = () -> { // lambda Expretions.... and anonmius method..
            System.out.println("Hello Ganshay");
        };
        m.display();
    }
}
