package Sesi3;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
	String nim;
	String nama;
	int nilai;
	String grade;
	
	// Constructor
	Mahasiswa (String nim, String nama, int nilai) {
		this.nim = nim;
		this.nama = nama;
		this.nilai = nilai;
		this.grade = hitungGrade(nilai);
	}

	// Method menentukan grade
	String hitungGrade(int nilai) {
		if (nilai >= 80 && nilai <= 100) {
			return "A";
		} else if (nilai >= 70) {
			return "B";
		} else if (nilai >= 60) {
			return "C";
		} else if (nilai >= 50) {
			return "D";
		} else if (nilai >= 0) {
			return "E";
		} else {
			return "Input nilai anda salah";
		}
	}
	
	// Method cek lulus
	boolean isLulus() {
		return nilai >= 60;
	}
	
	// Method tampil data
	void tampil() {
		System.out.println("NIM   : " + nim);
		System.out.println("Nama  : " + nama);
		System.out.println("Nilai : " + nilai);
		System.out.println("Grade : " + grade);
		System.out.println("-------------------------------------");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Mahasiswa> data = new ArrayList<>();
		
		System.out.println("Jumlah mahasiswa: ");
		int jumlah = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < jumlah; i++) {
			System.out.println("\nData Mahasiswa ke-" + (i + 1));
			
			System.out.println("NIM: ");
			String nim = input.nextLine();
			
			System.out.println("Nama: ");
			String nama = input.nextLine();
			
			System.out.println("Nilai: ");
			int nilai = input.nextInt();
			input.nextLine();
			
			data.add(new Mahasiswa(nim, nama, nilai));
		}
		
		System.out.println("\n===== DATA MAHASISWA =====");
		int totalNilai = 0;
		int lulus = 0;
		int tidakLulus = 0;
		int A=0, B=0, C=0, D=0;
		
		String namaLulus = "";
		String namaTidakLulus = "";
		
		for (Mahasiswa m : data) {
			m.tampil();
			totalNilai += m.nilai;
			
			if (m.isLulus()) {
				lulus++;
				namaLulus += m.nama + ", ";
			} else {
				tidakLulus++;
				namaTidakLulus += m.nama + ", ";
			}
			
			switch (m.grade) {
				case "A": A++; break;
				case "B": B++; break;
				case "C": C++; break;
				case "D": D++; break;
			}
		}
		
		double rata = (double) totalNilai / jumlah;
		
		System.out.println("Jumlah Mahasiswa: " + jumlah);
		System.out.println("Jumlah Mahasiswa yang lulus: " + lulus + " yaitu " + namaLulus);
		System.out.println("Jumlah Mahasiswa yang tiak lulus: " + tidakLulus + " yaitu " + namaTidakLulus);
		System.out.println("Jumlah Mahasiswa nilai A: " + A);
		System.out.println("Jumlah Mahasiswa nilai B: " + B);
		System.out.println("Jumlah Mahasiswa nilai C: " + C);
		System.out.println("Jumlah Mahasiswa nilai D: " + D);
		System.out.println("Rata-rata nilai Mahasiswa: " + rata);
	}
}
