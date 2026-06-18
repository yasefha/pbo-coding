package sesi11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class CSVWriter {

	public static void main(String[] args) {
		String csvFile = "D:\\Code\\pbo\\coding\\src\\sesi11\\student.csv";
		Scanner input = new Scanner(System.in);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
			System.out.println("Masukkan jumlah mahasiswa: ");
			int jumlah = input.nextInt();
			input.nextLine();
			
			for (int i = 0; i < jumlah; i++) {
				System.out.println("\nData Mahasiswa ke-" + (i+1));
				
				System.out.println("NIM: ");
				String nim = input.nextLine();
				
				System.out.println("Nama: ");
				String nama = input.nextLine();
				
				System.out.println("Umur: ");
				String umur = input.nextLine();
				
				String data = nim + "," + nama + "," + umur;
				
				bw.write(data);
				bw.newLine();
			}
			System.out.println("\nData berhasil disimpan ke" + csvFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		input.close();

	}

}
