import java.util.Scanner;

public class Tugas2 {
    private static int[][] penjualan;
    private static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        penjualan = new int[jumlahMahasiswa][jumlahTugas];

        inputPenjualan(scanner, jumlahMahasiswa, jumlahTugas);

        tampilkanPenjualan(jumlahMahasiswa, jumlahTugas);

        tampilkanMenuTerlaris(jumlahMahasiswa, jumlahTugas);

        tampilkanRataRataPenjualan(jumlahMahasiswa, jumlahTugas);

        scanner.close();
    }

    public static void inputPenjualan(Scanner scanner, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan penjualan untuk " + menu[i] + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanPenjualan(int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("\nRekap Penjualan:");
        System.out.printf("%-12s", "Menu");
        for (int i = 1; i <= jumlahTugas; i++) {
            System.out.printf("%10s", "Hari ke-" + i);
        }
        System.out.println();
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-12s", menu[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.printf("%10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void tampilkanMenuTerlaris(int jumlahMahasiswa, int jumlahTugas) {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menuTerlaris + " dengan total penjualan sebanyak " + maxPenjualan);
    }

    public static void tampilkanRataRataPenjualan(int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("\nRata-rata penjualan per menu:");
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / jumlahTugas;
            System.out.printf("%-12s: %.2f\n", menu[i], rataRata);
        }
    }
}
