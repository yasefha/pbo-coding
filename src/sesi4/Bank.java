package sesi4;

public class Bank {
	// 1) Transfer sederhana
	void transferUang(int jumlah, String rekeningTujuan) {
		System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan);
	}
	
	// 2) Transfer dengan bank tujuan
	void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
		System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " (" + bankTujuan + ")");
	}
	
	// 3) Transfer dengan berita
	void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
		System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " (" + bankTujuan + ") dengan berita: " + berita);
	}
	
	// 4) Suku bunga default
	void sukuBunga() {
		System.out.println("Suku bunga standar adalah 3%");
	}
}

class BankBNI extends Bank {
	@Override
	void sukuBunga() {
		System.out.println("Suku bunga BNI adalah 4%");
	}
	
	@Override
	void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
		bankTujuan = "BNI";
		System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " (" + bankTujuan + ")");
	}
}

class BankBCA extends Bank {
	@Override
	void sukuBunga() {
		System.out.println("Suku bunga BCA adalah 4.5%");
	}
	
	@Override
	void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
		bankTujuan = "BCA";
		System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " (" + bankTujuan + ")");
	}
}

class BankDenganBiaya extends Bank {
	int hitungBiaya(String bankTujuan) {
		if (bankTujuan.equalsIgnoreCase("BNI")) {
			return 2000;
		} else if (bankTujuan.equalsIgnoreCase("BCA")) {
			return 2500;
		} else {
			return 5000; // antar bank lain
		}
	}
	
	void transferDenganBiaya(int jumlah, String rekeningTujuan, String bankTujuan) {
		int biaya = hitungBiaya(bankTujuan);
		System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " (" + bankTujuan + ") dengan biaya: " + biaya);
	}
}