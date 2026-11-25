import java.util.Scanner;

public class SurveiKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        int nilai;
        double total, rata;

        System.out.println("Input hasil Survei (Skala 1-5)");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                    nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        survei[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Nilai tidak valid! Masukkan angka antara 1-5.");
                    }
                }
            }
        }

        System.out.println("Rata-rata setiap responden");
        for (int i = 0; i < survei.length; i++) {
            total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            rata = total / survei[i].length;
            System.out.printf("Responden ke-%d : %.2f\n", (i + 1), rata);
        }

        System.out.println("Rata-rata setiap pertanyaan");
        for (int j = 0; j < survei[0].length; j++) {
            total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            rata = total / survei.length;
            System.out.printf("Pertanyaan ke-%d : %.2f\n", (j + 1), rata);
        }

        sc.close();
    }
}