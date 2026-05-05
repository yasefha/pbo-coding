package sesi6;

class Toshiba implements Laptop {
    private int volume = 40;

    public void powerOn() {
        System.out.println("Toshiba hidup...");
    }

    public void powerOff() {
        System.out.println("Toshiba dimatikan...");
    }

    public void volumeUp() {
        volume += 5;
        System.out.println("Volume Toshiba: " + volume);
    }

    public void volumeDown() {
        volume -= 5;
        System.out.println("Volume Toshiba: " + volume);
    }
}