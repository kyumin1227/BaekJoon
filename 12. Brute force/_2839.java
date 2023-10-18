import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;

        if (N >= 5) {
            count += N / 5;
            N = N % 5;
        }
        
        if (N == 4 && count >= 1) {
            System.out.println(count += 2);
        } else if (N == 3) {
            System.out.println(count += 1);
        } else if (N == 2 && count >= 2) {
            System.out.println(count += 2);
        } else if (N == 1 && count >= 1) {
            System.out.println(count+1);
        } else if (N == 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
