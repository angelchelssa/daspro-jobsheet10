import java.util.Scanner;

public class Percobaan4Pertanyaan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mahasiswa, mataKuliah;
        System.out.print("Masukkan jumlah mahasiswa: ");
        mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        mataKuliah = sc.nextInt();
        int nilai[][] = new int[mahasiswa][mataKuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalPerSiswa / mataKuliah));
        }

            System.out.println("\n================================");
            System.out.println("Rata rata nilai setiap mata kuliah");

            for (int j = 0; j < 3; j++){
                double totalPerMatkul = 0;

                for (int i = 0; i < 4; i++) {
                    totalPerMatkul += nilai[i][j];
                }
                System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/mataKuliah);
            }
    }
}
