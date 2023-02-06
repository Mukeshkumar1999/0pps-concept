// package InnerClass;

class Outer {
    static int x = 10;
    Inner i = new Inner();

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);

        }
    }

    public void OuterDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class inner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();
        // Outer.Inner oi = new Outer().new Inner();

        // oi.innerDisplay();

    }

}
