import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());

        BigInteger num = N;
        for (int i = N.intValue() - 1; i > 0; i--) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        if (num == BigInteger.valueOf(0)) num = BigInteger.valueOf(1);
        String s = num.toString();
        int answer = 0;
        for(int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '0') answer += 1;
            else break;
        }
        System.out.println(answer);
    }
}
