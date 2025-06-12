package latihan3;
public class Rumus {
// Nama: [Muhammad Nabil Zaky]
// NPM : [2310010511]
// Kelas: [4C REG BJM]
public class BangunDatar {
    // Atribut-atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;
}
    // Method untuk menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    // Method untuk menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }

    // Contoh main method untuk menjalankan
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        // Contoh hitung luas persegi
        bd.sisi = 5;
        bd.hitungLuasPersegi();

        // Contoh hitung luas persegi panjang
        bd.panjang = 8;
        bd.lebar = 4;
        bd.hitungLuasPersegiPanjang();
    }
}
