import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = 0, kolom = 0;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan Baris (1-4) : ");
                        baris = sc.nextInt();
                        if (baris >= 1 && baris <= 4) {
                            break;
                        } else {
                            System.out.println("Baris tidak valid! Masukkan angka antara 1 dan 4.");
                        }
                    }

                    while (true) {
                        System.out.print("Masukkan Kolom (1-2) : ");
                        kolom = sc.nextInt();
                        if (kolom >= 1 && kolom <= 2) {
                            break;
                        } else {
                            System.out.println("Kolom tidak valid! Masukkan angka antara 1 dan 2.");
                        }
                    }
                    sc.nextLine();

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out
                                .println("Peringatan: Kursi di Baris " + baris + ", Kolom " + kolom + " sudah terisi!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1, 2, atau 3.");
            }
        }
    }
}