import java.util.Scanner;
public class ClassMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassDataDosen06 list = new ClassDataDosen06();

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda → tertua)");
            System.out.println("4. Sorting DSC (Usia tertua → termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode          : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    ClassDosen06 d = new ClassDosen06(kode, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Data diurutkan ASC (termuda → tertua)");
                    list.tampil();
                    break;

                case 4:
                    list.insertionSort();
                    System.out.println("Data diurutkan DSC (tertua → termuda)");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}