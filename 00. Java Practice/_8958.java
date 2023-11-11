import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int value = 0;
        int score = 0;
        for (int i = 0; i < N; i++) {
            char[] array = br.readLine().toCharArray();
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 79) {
                    value += 1;
                } else {
                    value = 0;
                }
                score += value;
            }
            System.out.println(score);
            score = 0;
            value = 0;
        }
    }
}