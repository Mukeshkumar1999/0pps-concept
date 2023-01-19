class Bycycle {
    int Gear;
    int Speed;

    public Bycycle(int g, int s) {
        this.Gear = g;
        this.Speed = s;
    }

    public void NoGear() {
        System.out.println(this.Gear);
    }

    public void SpeedUp() {
        System.out.println("Bycycle" + " " + this.Speed);
    }

    // public void speedMainual(int sp) {
    // System.out.println(sp);
    // }
}

class MountainBike extends Bycycle {
    int hightSeat;

    public MountainBike(int g, int s, int hs) {
        super(g, s);
        hightSeat = hs;
    }

    public void highSt() {
        System.out.println(this.hightSeat);
    }

    @Override
    public void SpeedUp() {
        System.out.println("Mountain" + " " + super.Speed);
    }
}

public class Test {
    public static void main(String[] args) {
        Bycycle b = new Bycycle(5, 100);
        b.NoGear();
        b.SpeedUp();
        // b.speedMainual(50);

        // MountainBike m = new MountainBike(5, 100, 25);
        // m.highSt();
        // m.SpeedUp();

        // Bycycle c = new MountainBike(4, 90, 23); // Dynamic Methods of dispatch..
        // c.NoGear();
        // c.SpeedUp();
        // c.highSt();
    }
}
