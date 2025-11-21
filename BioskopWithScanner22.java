import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {

                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();

                        int baris, kolom;

                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); 

                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("⚠ Kursi sudah terisi! Pilih kursi lain.\n");
                            } else {
                                break; 
                            }
                        }

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lain? (y/n): ");
                        if (sc.nextLine().equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print("[" + isi + "]\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);

        sc.close();
    }
}