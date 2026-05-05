package sesi7.no3;

class Student extends Person implements Aktivitas {

    public Student(String nama) {
        super(nama);
    }

    public void display() {
        System.out.println("Mahasiswa: " + nama);
    }

    public void kerja() {
        System.out.println(nama + " sedang belajar");
    }
}