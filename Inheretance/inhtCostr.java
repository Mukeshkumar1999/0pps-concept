class parent {
    public parent() {
        System.out.println(" No parameter Pass");
    }
}

class child extends parent {
    public child() {
        System.out.println("No child Parameter Pass");

    }
}

class GrandChild extends child {
    public GrandChild() {
        System.out.println("No Grand Parameter Pass");
    }
}

public class inhtCostr {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();

    }
}
