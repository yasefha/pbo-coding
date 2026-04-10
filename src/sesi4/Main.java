package sesi4;

public class Main {
	public static void main(String[] args) {
		System.out.println("=== Method Overloading ===");
		Bank bank = new Bank();
		bank.transferUang(100000, "123456");
		bank.transferUang(200000, "123456", "BCA");
		bank.transferUang(300000, "123456", "BNI", "Bayar hutang");
		bank.sukuBunga();
		
		System.out.println("\n=== Method Overriding ===");
		BankBNI bni = new BankBNI();
		bni.sukuBunga();
		bni.transferUang(150000, "987654", "bebas");
		
		BankBCA bca = new BankBCA();
		bca.sukuBunga();
		bca.transferUang(250000, "567890", "bebas");
		
		System.out.println("\n=== Bonus Biaya Transfer ===");
		BankDenganBiaya bb = new BankDenganBiaya();
		bb.transferDenganBiaya(500000, "111222", "BNI");
		bb.transferDenganBiaya(500000, "333444", "BCA");
		bb.transferDenganBiaya(500000, "555666", "Mandiri");
	}
}
