package sesi10;

public class Exception5 {

	 public static void main(String[] args) {
	 int bil=10;
	 try
	 {
	 System.out.println(bil/0);
	 }
	 catch(ArithmeticException e)
	 {
	 System.out.println("Pesan error: ");
	 System.out.println(e.getMessage());
	 System.out.println("Info stack erase");
	 e.printStackTrace();
	 e.printStackTrace(System.out);
	 }
	 catch(Exception e)
	 {
	 System.out.println("Ini menghandle error yang terjadi");
	 }
	 }
	}

/*
 * Analisa:
 * Program mencoba melakukan operasi pembagian 10/0 yang menyebabkan
 * ArithmeticException. Exception tersebut ditangkap oleh blok
 * catch(ArithmeticException), kemudian program menampilkan pesan error,
 * detail penyebab error melalui getMessage(), serta informasi stack trace
 * menggunakan printStackTrace(). Blok catch(Exception) tidak dijalankan
 * karena exception sudah ditangani oleh catch yang lebih spesifik.
 */