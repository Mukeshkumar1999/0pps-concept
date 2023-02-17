class HondaCity {
    static int price = 100000;
    int a, b;

    static void OnRoadPrice(String city) {
        switch (city) {
            case ("delhi"):
                System.out.println(price + price * 5);
                break;

            case ("mumbai"):
                System.out.println(price + price * 9);
                break;

            case ("punjab"):
                System.out.println(price + price * 4);
                break;
        }
    }
}

public class staticMember {
    public static void main(String[] args) {
        HondaCity v1 = new HondaCity();
        HondaCity v2 = new HondaCity();
        System.out.println(v1.price);
        System.out.println(v2.price);
        // HondaCity.OnRoadPrice("delhi");
    }
}
