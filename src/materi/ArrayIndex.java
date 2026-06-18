package materi;

public class ArrayIndex {

	public static void main(String[] args) {
		try {
			int[] angka = {1,2,3};
			System.out.println(angka[2]);
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("Index array tidak tersedia");
		} finally {
			System.out.println("Program selesai");
		}

	}

}
