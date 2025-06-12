package latihan3;
// Nama : [Muhammad Nabil Zaky]
// NPM  : [2310010511]
// Kelas: [4C REG BJM]
public class Rumus {
    // Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    // Konstruktor untuk inisialisasi awal
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    // Method accessor untuk mendapatkan nilai hasil
    public int getHasil() {
        return hasil;
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
}
