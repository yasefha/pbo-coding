package sesi7.no3;

class Dosen extends Person implements Aktivitas {

    public Dosen(String nama) {
        super(nama);
    }

    public void display() {
        System.out.println("Dosen: " + nama);
    }

    public void kerja() {
        System.out.println(nama + " sedang mengajar");
    }
}