import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String number = Integer.toString(sc.nextInt());
        char[] array = number.toCharArray();
        int total = 0;

        for (int i = 0; i < num; i++) {
            total += array[i] - 48;
        }
        System.out.println(total);
    }
}
