import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5073 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            int max = a;
            if (max < b)
                max = b;
            if (max < c)
                max = c;

            if (max >= a + b || max >= b + c || max >= a + c)
                System.out.println("Invalid");
            else if (a != b && a != c && b != c)
                System.out.println("Scalene");
            else if (a == b && b == c)
                System.out.println("Equilateral");
            else
                System.out.println("Isosceles");
        }

    }
}
