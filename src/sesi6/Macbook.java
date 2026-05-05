package sesi6;

class MacBook implements Laptop {
    private int volume = 30;

    public void powerOn() {
        System.out.println("MacBook ON");
    }

    public void powerOff() {
        System.out.println("MacBook OFF");
    }

    public void volumeUp() {
        volume += 15;
        System.out.println("Volume MacBook: " + volume);
    }

    public void volumeDown() {
        volume -= 15;
        System.out.println("Volume MacBook: " + volume);
    }
}
