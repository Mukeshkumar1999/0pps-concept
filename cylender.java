class Cylender1 {
    private double radius;
    private int height;

    public void setRadius(double r) {
        radius = r;

    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public Cylender1() {
        height = 0;
        radius = 0;

    }

    public Cylender1(double r, int h) {
        radius = r;
        height = h;
    }

    public void disArea() {
        System.out.println((Math.PI * 2 * radius * height) + (2 * Math.PI * radius * radius));
    }

    public void disPerimeter() {
        System.out.println(4 * radius + 2 * height);
    }

    public boolean getdisra() {
        if (radius > 0)
            return true;
        else
            return false;
    }

}

public class cylender {

    public static void main(String[] args) {
        Cylender1 c1 = new Cylender1();
        // Cylender1 c1 = new Cylender1(10.6, 10);
        c1.setRadius(10.6);
        c1.setHeight(10);
        c1.disArea();
        c1.disPerimeter();

        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        System.out.println(c1.getdisra());
    }

}
