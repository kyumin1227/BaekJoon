import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9095 {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            cal(Integer.parseInt(br.readLine()));

            System.out.println(count);
        }
    }
    
    public static void cal(int x) {
        if (x == 0) {
            count++;
        } else if (x < 0) {

        } else {
            cal(x - 1);
            cal(x - 2);
            cal(x - 3);
        }
    }
}