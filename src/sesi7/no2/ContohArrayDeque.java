package sesi7.no2;

import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("A");
        antrian.add("B");
        antrian.add("C");

        System.out.println("Antrian: " + antrian);

        antrian.poll(); // hapus depan

        System.out.println("Setelah poll: " + antrian);
    }
}
