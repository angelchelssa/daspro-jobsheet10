import java.util.Scanner;

public class Percobaan2Pertanyaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String penonton[][] = new String[4][2];
        int baris, kolom, pilihan;
        String nama, next;

        while (true) {
            System.out.println("SELAMAT DATANG DI BIOSKOP CINEMIX");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar penonton");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan dengan angka: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 0:
                    System.out.println("TERIMA KASIH");
                    sc.close();
                    return; 
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris : ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                            penonton[baris - 1][kolom - 1] = nama;
                        
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print((penonton[i][j] != null ? penonton[i][j] : "null") + " ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("MASUKKAN PILIHAN YANG TERSEDIA SAJA");
            }
        }
    }
}