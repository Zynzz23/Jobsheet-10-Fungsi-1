import java.util.Scanner;

public class Kubus20 {
    public double sisi;

    public Kubus20(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        Kubus20 kubus = new Kubus20(sisi);

        System.out.println("Volume kubus: " + kubus.hitungVolume());
        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());

        scanner.close();
    }
}
