import java.util.Scanner;

public class _8393 {
    public static void main(String[] arags) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();
        int answer = 0;

        for(int i = 1; i<=inputA; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
