import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Masukkan angka (0 untuk keluar): ");
            int angka = scanner.nextInt();

            if (angka == 0) {
                running = false;
                continue;
            }

            if (angka % 5 == 0) {
                System.out.println(angka + " adalah kelipatan 5.");
            } else {
                System.out.println(angka + " bukan kelipatan 5.");
            }
        }

        scanner.close();
    }
}
