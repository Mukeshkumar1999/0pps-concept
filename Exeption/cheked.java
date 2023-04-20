import java.io.*;

public class cheked {

    // these are Exeptions class...
    static void fun1() {
        FileInputStream f1 = new FileInputStream("Myjava.txt"); // these types of exeptions are cheked exeptions...

    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
