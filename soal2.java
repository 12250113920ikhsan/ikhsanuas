import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan teks (ketik 'exit' untuk keluar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program selesai.");
                break;
            }

            if (input.length() == 5) {
                System.out.println("Panjang teks adalah 5 karakter.");
            } else {
                System.out.println("Panjang teks bukan 5 karakter.");
            }
        }

        scanner.close();
    }
}

