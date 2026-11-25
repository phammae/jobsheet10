import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        boolean program = true;

        String penonton[][] = new String[4][2];

        while (program) {
            
            System.out.println("=========Menu Bioskop=========");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();
    
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = sc.nextLine();
    
                        while (true) {
                            System.out.print("Masukkan Baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan Kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();
    
                            if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("Baris atau kolom tidak tersedia.");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Warning: Kursi baris " + baris + " kolom " + kolom
                                        + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "!");
                                System.out.println("Tolong masukkan nomor baris dan kolom lagi.");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                break;
                            }
                        }
    
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
    
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
    
                    }
                    break;
    
                case 2:
                    System.out.println("=========Daftar Penonton=========");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Pneonton baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(isiKursi + (j < penonton[i].length - 1 ? ", " : ""));
                        }

                        System.out.println();
                    }
                    break;
    
                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    program = false;
                    break;
    
                default:
                    System.out.println("Menu tidak valid! Silakan pilih 1, 2, atau 3.");
                    break;
            }
        }

        sc.close();
    }
}
