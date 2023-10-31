import java.util.Scanner;

public class _3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[6];
        int[] inputNum = new int[6];

        num[0] = 1;
        num[1] = 1;
        num[2] = 2;
        num[3] = 2;
        num[4] = 2;
        num[5] = 8;

        for (int i = 0; i < num.length; i++) {
            inputNum[i] = sc.nextInt();
            if (inputNum[i] <= num[i]) {
                System.out.print(num[i] - inputNum[i] + " ");
            } else {
                System.out.print((inputNum[i] - num[i]) * -1 + " ");
            }
        }

    }
}
