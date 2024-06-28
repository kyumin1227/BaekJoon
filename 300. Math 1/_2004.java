import java.util.Scanner;

public class _2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        int two = count_two(n) - count_two(n - m) - count_two(m);
        int five = count_five(n) - count_five(n - m) - count_five(m);

        System.out.println(Math.min(two, five));

    }

    public static int count_two(int n) {
        int count = 0;
        while (n >= 2) {
            count += (int) (n / 2);
            n /= 2;
        }

        return count;
    }

    public static int count_five(int n) {
        int count = 0;
        while (n >= 5) {
            count += (int) (n / 5);
            n /= 5;
        }

        return count;
    }
}
