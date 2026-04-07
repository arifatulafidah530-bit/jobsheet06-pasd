public class ClassDosen06 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    ClassDosen06(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("JK   : " + jk);
        System.out.println("Usia : " + usia);
        System.out.println("----------------------");
    }
}