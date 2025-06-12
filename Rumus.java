package latihan3;
public class Rumus {
// Nama : [Muhammad Nabil Zaky]
// NPM  : [2310010511]
// Kelas: [4C REG BJM]
    public class BangunDatar {
    // Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;
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
