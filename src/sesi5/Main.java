package sesi5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Student
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        Student s = new Student(nama, alamat);

        System.out.print("Jumlah Mata Kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nama MK: ");
            String mk = input.nextLine();

            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine();

            s.addCourseGrade(mk, nilai);
        }

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println(s);
        s.printGrades();
        System.out.println("Rata-rata: " + s.getAverageGrade());

        // Input Teacher
        System.out.print("\nNama Dosen: ");
        String namaDosen = input.nextLine();

        System.out.print("Alamat Dosen: ");
        String alamatDosen = input.nextLine();

        Teacher t = new Teacher(namaDosen, alamatDosen);

        System.out.print("Jumlah MK diajar: ");
        int m = input.nextInt();
        input.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.print("Nama MK: ");
            String mk = input.nextLine();

            if (t.addCourse(mk)) {
                System.out.println("Berhasil ditambahkan");
            } else {
                System.out.println("Gagal (sudah ada)");
            }
        }

        System.out.println("\n=== DATA DOSEN ===");
        System.out.println(t);

        input.close();
    }
}