// package error;

class construct {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 10;
            b = 3;
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Devide by zero");
        }
    }
}