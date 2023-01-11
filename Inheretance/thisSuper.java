class rectangle {
    int length;
    int bredth;
    int x = 10;

    rectangle(int l, int b) {
        this.length = l;
        this.bredth = b;
    }
}

class cuboid extends rectangle {
    int hiegth;
    int x = 20;

    public cuboid(int l, int b, int h) {
        super(l, b);
        this.hiegth = h;
    }

    public void display() {
        System.out.println(super.x);
        System.out.println(x);
        System.out.println("area" + " " + length * bredth * hiegth);
    }

}

public class thisSuper {
    public static void main(String[] args) {
        cuboid cb = new cuboid(10, 20, 30);
        cb.display();
    }

}
