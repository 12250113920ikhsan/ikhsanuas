import java.util.Scanner;

public class soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println("Masukkan nilai-nilai array:");

        for (int i = 0; i < length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int largestMultipleOfFiveIndex = findLargestMultipleOfFiveIndex(numbers);
        if (largestMultipleOfFiveIndex != -1) {
            System.out.println("Angka terbesar dan kelipatan 5 ditemukan pada indeks: " + largestMultipleOfFiveIndex);
        } else {
            System.out.println("Tidak ada angka terbesar dan kelipatan 5 dalam array.");
        }
    }

    public static int findLargestMultipleOfFiveIndex(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] > maxNumber) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
