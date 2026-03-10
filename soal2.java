import java.util.Scanner;

public class BiayaServisKomputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah, peripheral, luarJam, dropOff;
        double baseFee, additionalFee, total;

        System.out.print("Masukkan jumlah komputer: ");
        jumlah = sc.nextInt();

        System.out.print("Masukkan jumlah peripheral: ");
        peripheral = sc.nextInt();

        System.out.print("Apakah di luar jam kerja? 1=Ya, 0=Tidak: ");
        luarJam = sc.nextInt();

        System.out.print("Apakah pelanggan drop off dan pick up sendiri? 1=Ya, 0=Tidak: ");
        dropOff = sc.nextInt();

        if (jumlah == 1 || jumlah == 2) {
            baseFee = 50;
            additionalFee = 0;
        } else if (jumlah >= 3 && jumlah <= 10) {
            baseFee = 100;
            additionalFee = 10 * peripheral;
        } else {
            baseFee = 500;
            additionalFee = 10 * peripheral;
        }

        if (luarJam == 1) {
            baseFee = baseFee * 2;
        }

        total = baseFee + additionalFee;

        if (dropOff == 1) {
            total = total / 2;
        }

        System.out.println("Total biaya servis = " + total);
    }
}