class Costomer1 {
    private String cosmId;
    private String name;
    private String addres;
    private String phone;

    Costomer1(String cosmId, String name, String addres, String phone) {
        this.cosmId = cosmId;
        this.name = name;
        this.addres = addres;
        this.phone = phone;
    }
    // Costomer1(String id, String name, String adds, String ph) {
    // cosmId = id;
    // name = name;
    // addres = adds;
    // phone = ph;
    // }

    // public void setCosId(String id) {
    // cosmId = id;
    // }

    public void getCostId() {
        System.out.println(cosmId);
    }

    // public void setName(String naam) {
    // name = naam;
    // }

    public void getName() {
        System.out.println(name);
    }

    public void setAddres(String add) {
        addres = add;
    }

    public void getAddres() {
        System.out.println(addres);
    }

    public void setPhone(String ph) {
        phone = ph;
    }

    public void getPhone() {
        System.out.println(phone);
    }
}

public class costomer {
    public static void main(String[] args) {
        Costomer1 cr = new Costomer1("Ram-123", "Ganesha", "punjab", "7408842136");
        // cr.setName("Ram");
        cr.getCostId();
        cr.getName();
        cr.getAddres();
        cr.getPhone();
    }

}
