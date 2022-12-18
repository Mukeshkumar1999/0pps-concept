class Product1 {
    private String ProdId;
    private String name;
    private int quntites;
    private String quality;

    Product1(String id, String naam, int qutes, String qul) {
        this.ProdId = id;
        this.name = naam;
        this.quntites = qutes;
        this.quality = qul;

    }

    public void getProductId() {
        System.out.println(ProdId);
    }

    public void getName() {
        System.out.println(name);
    }

    public void setQunties(int q) {
        this.quntites = q;
    }

    public void getQunties() {
        System.out.println(quntites);

    }

    public void setquality(String g) {
        this.quality = g;
    }

    public void getquality() {
        System.out.println(quality);

    }

}

public class product {
    public static void main(String[] args) {
        Product1 p = new Product1("MamaEarth-234", "MamiEarth", 100, "Good");

        p.getProductId();
        p.getName();
        p.getQunties();
        p.getquality();
    }

}
