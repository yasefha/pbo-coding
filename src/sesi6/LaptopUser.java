package sesi6;

class LaptopUser {
    Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    void turnOnLaptop() {
        laptop.powerOn();
    }

    void turnOffLaptop() {
        laptop.powerOff();
    }

    void makeLouder() {
        laptop.volumeUp();
    }

    void makeSilent() {
        laptop.volumeDown();
    }
}
