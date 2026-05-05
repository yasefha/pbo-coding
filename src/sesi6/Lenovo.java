package sesi6;

class Lenovo implements Laptop {
    private int volume = 50;

    public void powerOn() {
        System.out.println("Lenovo menyala...");
    }

    public void powerOff() {
        System.out.println("Lenovo mati...");
    }

    public void volumeUp() {
        volume += 10;
        System.out.println("Volume Lenovo: " + volume);
    }

    public void volumeDown() {
        volume -= 10;
        System.out.println("Volume Lenovo: " + volume);
    }
}