package access;

class A {
    protected void display() {
        System.out.println("Example of Protected");
    }
}

public class prote extends A {
    public static void main(String[] args) {
        prote p = new prote();
        p.display();
    }
}
