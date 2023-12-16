import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = N;
        for (int i = N - 1; i > 0; i--) {
            num *= i;
        }
        if(num == 0) num += 1;
        System.out.println(num);
    }
}
