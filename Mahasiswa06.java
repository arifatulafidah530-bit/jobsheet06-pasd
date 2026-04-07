public class Mahasiswa06 {
    String nim;
    String nama;
    double ipk;
    String kelas;

    // Konstruktor default
    Mahasiswa06() {
    }

    // Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa06(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    // Method tampil
    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
         System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
       
    }
}