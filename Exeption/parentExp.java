// package Exeption;

public class parentExp {
    public static void main(String[] args) {
        int[] arr = { 10, 0, 3, 4, 5, 6 };
        int r;

        try {
            r = arr[0] / arr[2];
            System.out.println(r);

            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println(e); // your are write proper massages...
        } catch (Exception e) { // Parent Class of all type of exeptions automatic handles....

            System.out.println(e); // your are write proper massages...
        }
    }
}
