import java.math.BigInteger;
import java.util.Scanner;

public class _10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        BigInteger[][] bp = new BigInteger[n + 1][10];

        // 첫번째 배열에 기본값 할당
        bp[1][0] = new BigInteger("0");
        for (int i = 1; i < 10; i++) {
            bp[1][i] = new BigInteger("1");
        }

        for (int i = 2; i <= n; i++) {
            // 0과 9는 하나의 값만을 받기 때문에 예외 처리
            bp[i][0] = bp[i - 1][1];
            bp[i][9] = bp[i - 1][8];

            for (int j = 1; j < 9; j++) {
                bp[i][j] = bp[i - 1][j - 1].add(bp[i - 1][j + 1]);
            }
        }

        BigInteger result = new BigInteger("0");
        for (int i = 0; i < 10; i++) {
            result = result.add(bp[n][i]);
        }

        System.out.println(result.mod(new BigInteger("1000000000")));
    }
}
