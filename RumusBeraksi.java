package latihan3;
public class RumusBeraksi {
        public static void main(String[] args) {
        Rumus r = new Rumus();

        // Hitung luas persegi
        r.sisi = 5;
        r.hitungLuasPersegi();
        System.out.println("Luas Persegi: " + r.getHasil());

        // Hitung luas persegi panjang
        r.panjang = 8;
        r.lebar = 3;
        r.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + r.getHasil());
    }
}
}
