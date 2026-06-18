package sesi11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "D:\\Code\\pbo\\coding\\src\\sesi11\\student.csv";
        String line;
        String csvSplitBy = ",";

        int jumlahBaris = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // Membaca header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(csvSplitBy);

                System.out.println(
                        "NIM : " + data[0]
                        + ", Nama : " + data[1]
                        + ", Umur : " + data[2]
                        + ", Prodi : " + data[3]
                );

                jumlahBaris++;
            }

            System.out.println("\nJumlah data mahasiswa = " + jumlahBaris);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}