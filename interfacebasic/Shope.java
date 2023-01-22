// import java.lang.reflect.Member;

interface Member {
    public void callBack();
}

class Store {
    Member[] mem = new Member[100];
    int count = 0;

    public void regester(Member m) {
        mem[count++] = m;
    }

    public void inviteSale() {
        for (int idx = 0; idx < count; idx++) {
            mem[idx].callBack();
        }
    }
}

class Costomer implements Member {
    String name;

    Costomer(String n) {
        name = n;
    }

    public void callBack() {
        System.out.println("ok i am visiting" + " " + name);
    }
}

public class Shope {
    public static void main(String[] args) {
        Store s = new Store();
        Costomer c1 = new Costomer("Ganeshay");
        Costomer c2 = new Costomer("Kartikey");
        s.regester(c1);
        s.regester(c2);
        s.inviteSale();
    }

}
