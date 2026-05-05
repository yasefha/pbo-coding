package sesi7.no3;

abstract class Person {
    protected String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    abstract void display();
}
