// package error;

public class neasted {
    public static void main(String[] args) {
        int[] arr = { 10, 0, 3, 4, 5, 6 };
        int r;
        try {
            r = arr[0] / arr[2];
            System.out.println(r);

            try {
                System.out.println(arr[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayOutOfBaund ");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmaticExeption");
        }
    }
}
