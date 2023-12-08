import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = st.nextToken();
        String num2 = st.nextToken();
        String num3 = st.nextToken();
        String num4 = st.nextToken();

        System.out.println((Long.parseLong(num1 + num2)) + (Long.parseLong(num3 + num4)));
    }
}
