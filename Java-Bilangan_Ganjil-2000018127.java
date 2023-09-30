import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("Masukkan nilai N: ");
        N = scanner.nextInt();

        System.out.println("Bilangan ganjil dari 1 hingga " + N + " adalah:");
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= N);
        System.out.println();
    }
}
