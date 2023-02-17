class Test1 {
    static int x = 10;
    int y = 20;

    public void show() {
        System.out.println(x + " " + y);
    }

    static void show1() {
        // System.out.println(x + " " + y); // static field only static method trace y
        // is
        // non static member
        System.out.println(x);
    }
}

public class staticPractice {
    public static void main(String[] args) {
        Test1 te = new Test1();
        te.show();
        te.show1();

        te.x = 30; // only static member changed...
        te.y = 40;
        Test1 t2 = new Test1();
        t2.show();
        t2.show1();

    }

}
