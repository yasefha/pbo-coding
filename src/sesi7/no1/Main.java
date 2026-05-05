package sesi7.no1;

public class Main {
    public static void main(String[] args) {

        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();

        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(2);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
