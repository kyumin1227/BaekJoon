import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 플러스면 더 큰걸 마이너스면 더 작은걸 찾아야 함

        int i = 1;

        if (n >= 0) {
            int check = 0;
            while (n > check) {
                check = (int) Math.pow(-2, i);
                i++;
            }
        } else {
            int check = 0;
            while (n < check) {
                check = (int) Math.pow(-2, i);
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < i; j++) {
            n -= Math.pow(-2, i - j - 1);
        }

        System.out.println(i);

        double d = Math.pow(-2, 3);
    }
}
