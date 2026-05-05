package sesi7.no3;

public class MainProject {
    public static void main(String[] args) {

        Student s1 = new Student("Andi");
        Dosen d1 = new Dosen("Pak Budi");

        s1.display();
        s1.kerja();

        d1.display();
        d1.kerja();

        // Collection + Generic
        Manager<String> listMK = new Manager<>();
        listMK.add("PBO");
        listMK.add("Basis Data");

        System.out.println("\nDaftar MK:");
        listMK.showAll();
    }
}
