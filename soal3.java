import java.util.Scanner;

public class soal3 {

        public static void main(String[] args) {
            int totalKelipatanLima = 0;
            int count = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan 10 angka:");

            while (count < 10) {
                int angka = scanner.nextInt();

                if (angka % 5 == 0) {
                    totalKelipatanLima++;
                }

                count++;
            }

            System.out.println("Jumlah angka yang merupakan kelipatan 5: " + totalKelipatanLima);
        }
    }

