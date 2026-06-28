package sesi10;

public class ThrowExample {

    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;

        // Baris di bawah ini tidak boleh ada karena tidak akan pernah dieksekusi
        // System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}

/*
 * Analisa:
 * Method demo() membuat dan melempar NullPointerException secara manual
 * menggunakan keyword throw. Setelah exception dilempar, method langsung
 * berhenti sehingga kode setelah throw tidak akan dijalankan. Exception
 * kemudian ditangkap oleh blok catch di main() dan menampilkan pesan error.
 */