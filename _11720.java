import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// import java.util.StringTokenizer;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];
        String S = br.readLine();
        // StringTokenizer st = new StringTokenizer(S, "");
        int total = 0;

        for(int i = 0; i<num; i++) {
            array[i] = Integer.parseInt(S.substring(i,i+1));
            total+=array[i];
        }
        System.out.println(total);
    }
}
