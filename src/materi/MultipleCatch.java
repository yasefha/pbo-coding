package materi;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// number format exception
			int angka = Integer.parseInt("abc");
			
			// Arithmetic
			int hasil = 5 / 0;
			
			// Array index
			int[] data = {1,2,3};
			System.out.println(data[5]);
		} catch (NumberFormatException e) {
			System.out.println("Format angka salah");
		} catch (ArithmeticException e) {
			System.out.println("Tidak bisa dibagi nol");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index melebihi batas");
		} catch (Exception e) {
			System.out.println("Exception umum");
		} finally {
			System.out.println("Program selesai");
		}
	}

}
