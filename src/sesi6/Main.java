package sesi6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Laptop:");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();

        Laptop laptop;

        if (pilih == 1) {
            laptop = new Lenovo();
        } else if (pilih == 2) {
            laptop = new Toshiba();
        } else {
            laptop = new MacBook();
        }

        LaptopUser user = new LaptopUser(laptop);

        String aksi;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("ON  - Nyalakan");
            System.out.println("OFF - Matikan");
            System.out.println("UP  - Volume +");
            System.out.println("DOWN- Volume -");
            System.out.println("EXIT- Keluar");
            System.out.print("Input: ");

            aksi = input.nextLine().toUpperCase();

            switch (aksi) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLouder();
                    break;
                case "DOWN":
                    user.makeSilent();
                    break;
                case "EXIT":
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Input tidak valid");
            }

        } while (!aksi.equals("EXIT"));

        input.close();
    }
}