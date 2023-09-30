import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        System.out.print("Masukkan jumlah baris dan kolom: ");
        rows = scanner.nextInt();
        cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Masukkan elemen-elemen array dua dimensi:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elemen-elemen array dua dimensi adalah:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
