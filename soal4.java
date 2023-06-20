import java.util.Scanner;

public class soal4 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] texts = new String[10];
            int count = 0;

            System.out.println("Masukkan 10 teks:");

            // Menerima 10 input teks
            for (int i = 0; i < 10; i++) {
                texts[i] = input.nextLine();
            }

            // Menghitung teks yang memiliki panjang 5 karakter
            for (String text : texts) {
                if (text.length() == 5) {
                    count++;
                }
            }

            System.out.println("Jumlah teks yang memiliki panjang 5 karakter: " + count);
        }
    }

