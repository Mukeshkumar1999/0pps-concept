// package interfacebasic;

interface test {
    void meth1();

    void meth2();

    void meth3();
}

class my implements test {
    public void meth1() {
        System.out.println("meth1");

    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}

public class basic {
    public static void main(String[] args) {
        test t = new my();
        t.meth1();
        t.meth1();
        t.meth3();
    }
}
