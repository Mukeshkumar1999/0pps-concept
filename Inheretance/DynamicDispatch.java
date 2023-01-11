class Super {
    public void meth1() {
        System.out.println("super meth1");
    }

    public void meth2() {
        System.out.println("super meth2");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub meth 2");
    }

    public void meth3() {
        System.out.println("sub meth3");
    }

}

public class DynamicDispatch {
    public static void main(String[] args) {
        // Sub s = new Sub();
        // s.meth1();
        // s.meth2();
        // s.meth3();
        Super s = new Sub();
        s.meth2();
        s.meth1();
    }

}
