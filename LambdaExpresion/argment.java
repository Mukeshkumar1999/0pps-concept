// package LambdaExpresion;
@FunctionalInterface
interface Additions {
    public int add(int x, int y);
}

public class argment {
    public static void main(String[] args) {
        Additions m = (a, b) -> { // lambda Expresion taking argument...
            return a + b;
        };
        System.out.println(m.add(4, 6));
    }
}
