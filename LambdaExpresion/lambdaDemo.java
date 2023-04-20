// package LambdaExpresion;

@FunctionalInterface
interface Mylambda {
    public void display();

}

class My implements Mylambda {
    public void display() {
        System.out.println("Hello God");
    }
}

public class lambdaDemo {
    public static void main(String[] args) {

        Mylambda p1 = new My();
        p1.display();
    }

}
