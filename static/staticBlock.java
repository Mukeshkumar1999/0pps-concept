// package static;
class Test {
    static {
        System.out.println("block1");
    }

    static {
        System.out.println("block2");
    }
}

public class staticBlock {
    // static {
    // System.out.println("block1");
    // }

    // static {
    // System.out.println("block2");
    // }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main");
        // Test t = new Test();
    }
}
