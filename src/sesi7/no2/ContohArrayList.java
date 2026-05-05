package sesi7.no2;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Citra");

        System.out.println("Isi ArrayList:");
        for (String n : nama) {
            System.out.println(n);
        }
    }
}
