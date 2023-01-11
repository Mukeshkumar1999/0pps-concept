class Super {
    public void display() {
        System.out.println("super class print");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("sub class print");
    }
}

public class overriding {

    // Method overriding as a redifining method of super class in sub class...
    public static void main(String[] args) {
        // Super su = new Super();
        // su.display();

        // Sub sb = new Sub();
        // sb.display();

        Super sub = new Sub(); // dynamic method dispatch in java...
        sub.display();
    }

}
