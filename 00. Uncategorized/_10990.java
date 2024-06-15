import java.util.Scanner;

public class _10990 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        for (int i = 0; i < num; i++) {

            for (int j = i + 1; j < num; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" ");
            }

            if (i != 0) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
