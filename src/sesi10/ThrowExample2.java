package sesi10;

public class ThrowExample2 {
	 public static void main(String[] args) {
	 try
	 {
	 throw new Exception("Here's my Exception");
	 }
	 catch(Exception e)
	 {
	 System.out.println("Caught Exception");
	 System.out.println("e.getMessage():"+e.getMessage());
	 System.out.println("e.toString():"+e.toString());
	 System.out.println("e.printStackTrace():");
	 e.printStackTrace();
	 }
	 }
	}

/*
 * Analisa:
 * Program secara sengaja melempar Exception menggunakan keyword throw.
 * Exception tersebut ditangkap oleh blok catch, kemudian program
 * menampilkan pesan error menggunakan getMessage(), toString(), dan
 * printStackTrace() untuk melihat detail serta lokasi terjadinya exception.
 */
