class parent {
    public parent() {
        System.out.println("No param Parent");

    }

    public parent(int x) {
        System.out.println("params of parent" + " " + x);
    }
}

class child extends parent {
    public child() {
        System.out.println("no params of child");
    }

    public child(int x, int y) {
        super(x);
        System.out.println("params of child" + " " + y);
    }
}

public class superConstr {
    public static void main(String[] args) {
        // child ch = new child();
        child ch = new child(10, 20);

    }
}
