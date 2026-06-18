package materi;

public class NullPointer {

	public static void main(String[] args) {
		try {
			String nama = "Ace";
			System.out.println(nama.length());
		} catch (NullPointerException e) {
			System.out.println("Objek masih null");
		}

	}

}
