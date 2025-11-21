import java.util.Scanner;
public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine(); 

        String[] namaSiswa = new String[jumlahSiswa];
        String[] namaMatkul = new String[jumlahMatkul];
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        System.out.println("\n=== Input Nama Siswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = sc.nextLine();
        }

        System.out.println("\n=== Input Nama Mata Kuliah ===");
        for (int j = 0; j < jumlahMatkul; j++) {
            System.out.print("Mata kuliah ke-" + (j + 1) + ": ");
            namaMatkul[j] = sc.nextLine();
        }

        System.out.println("\n=== Input Nilai ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Nilai untuk " + namaSiswa[i] + ":");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("  " + namaMatkul[j] + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Rata-rata Nilai per Siswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            double total = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                total += nilai[i][j];
            }
            System.out.println(namaSiswa[i] + ": " + (total / jumlahMatkul));
        }

        System.out.println("\n=== Rata-rata Nilai per Mata Kuliah ===");
        for (int j = 0; j < jumlahMatkul; j++) {
            double total = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                total += nilai[i][j];
            }
            System.out.println(namaMatkul[j] + ": " + (total / jumlahSiswa));
        }

        System.out.println("\n=== TABEL NILAI ===");
        System.out.print("Siswa\t\t");
        for (String mk : namaMatkul) {
            System.out.print(mk + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print(namaSiswa[i] + "\t");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
