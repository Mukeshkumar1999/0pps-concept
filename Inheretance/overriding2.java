class Tv {
    public void switchTv() {
        System.out.println("Switch ON/OFF Tv");
    }

    public void changeChannel() {
        System.out.println("Change Channel");
    }
}

class SmartTv extends Tv {
    @Override
    public void switchTv() {
        System.out.println("Switch ON/OFF  of SmartTv");
    }

    public void changeChannel() {
        System.out.println("Change Channel of SmartTv");
    }

    public void Browser() {
        System.out.println("Browser of SmartTv");
    }
}

public class overriding2 {
    public static void main(String[] args) {
        Tv t = new SmartTv();
        t.changeChannel();
        t.switchTv();
        // t.Browser(); // this is not applycable..

        // Tv t = new Tv();
        // t.changeChannel();
        // t.switchTv();
    }
}
