import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println(a+b+c);
        } else if (a > b + c) {
            System.out.println((b + c) * 2 - 1);
        } else if (b > a + c) {
            System.out.println((a + c) * 2 - 1);
        } else {
            System.out.println((a + b) * 2 - 1);
        }
    }
}
