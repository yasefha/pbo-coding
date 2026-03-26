package Sesi2;

class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    // Constructor
    HandPhone(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Getter jenis HP
    String getJenisHP() {
        return jenis_hp;
    }

    // Getter tahun pembuatan
    int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone("Android", 2023);

        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}
