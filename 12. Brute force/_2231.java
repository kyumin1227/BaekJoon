import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int sum;
        String SN = Integer.toString(N);
        boolean print = false;
        loopOut:
        for (int i = 1; i < N; i++) {
            sum = i;
            String s = Integer.toString(i);
            char[] num = s.toCharArray();
            for (int j = 0; j < s.length(); j++) {
                sum += num[j] - 48;
            }
            if (sum == N) {
                System.out.println(i);
                print = true;
                break loopOut;
            }
        }
        if (!print) {
            System.out.println(0);
        }
    }
}
