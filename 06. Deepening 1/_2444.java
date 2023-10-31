import java.util.Scanner;

public class _2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < input - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (input - i - 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
