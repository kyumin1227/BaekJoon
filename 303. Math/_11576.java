import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class _11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int sum = 0;

        for (int i = 1; i <= m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += Math.pow(A, m - i) * num;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> result = new Stack<>();

        while (sum != 0) {
            result.add(sum % B);
            sum /= B;
        }

        while (!result.isEmpty()) {
            bw.write(result.pop() + " ");
        }

        bw.flush();
    }
}
