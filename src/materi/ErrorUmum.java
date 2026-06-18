package materi;

public class ErrorUmum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int hasil = 10/2;
			System.out.println(hasil);
		} catch (ArithmeticException e) {
			System.out.println("Tidak bisa dibagi nol");
		}
	}

}
