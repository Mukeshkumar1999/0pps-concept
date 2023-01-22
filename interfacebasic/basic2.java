class phone {
    void call() {
        System.out.println("Phone Calling");
    }

    void sms() {
        System.out.println("Phone send Massege");
    }
}

interface Camera {
    void click();

    void recording();
}

interface MusicPlayer {
    void song();

    void play();

    void stop();
}

class SmartPhone extends phone implements Camera, MusicPlayer {
    void videoCall() {
        System.out.println("SmartPhone vedio Calling");
    }

    @Override
    public void call() {
        System.out.println("call to SmartPhone");
    }

    @Override
    public void sms() {
        System.out.println("send sms to SmartPhone");
    }

    @Override
    public void click() {
        System.out.println("take Picture");
    }

    @Override
    public void recording() {
        System.out.println("Start Recording");
    }

    @Override
    public void song() {
        System.out.println("Play Music");
    }

    @Override
    public void play() {
        System.out.println("play Music");
    }

    @Override
    public void stop() {
        System.out.println("stop music");
    }
}

public class basic2 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.play();
        s.recording();
        s.stop();
        s.song();
        s.videoCall();
        phone p = s; // s -> these are take refference of SmartPhone
        p.call();
        p.sms();
        Camera c = s;
        c.click();
        c.recording();

        MusicPlayer m = s;
        m.play();
        m.song();
        m.stop();

    }

}
