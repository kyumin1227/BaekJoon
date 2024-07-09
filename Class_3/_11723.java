import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11723 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] targetArray = new boolean[20];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if (s.equals("add")) {
                targetArray[Integer.parseInt(st.nextToken()) - 1] = true;
            } else if (s.equals("remove")) {
                targetArray[Integer.parseInt(st.nextToken()) - 1] = false;
            } else if (s.equals("check")) {
                if (targetArray[Integer.parseInt(st.nextToken()) - 1]) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (s.equals("toggle")) {
                int index = Integer.parseInt(st.nextToken()) - 1;
                targetArray[index] = !targetArray[index];
            } else if (s.equals("all")) {
                for (int j = 0; j < 20; j++) {
                    targetArray[j] = true;
                }
            } else {
                for (int j = 0; j < 20; j++) {
                    targetArray[j] = false;
                }
            }
        }
    }
}
