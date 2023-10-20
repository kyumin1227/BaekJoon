import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken()); // 학생수
        int k = Integer.parseInt(st.nextToken()); // 상 받는 사람 수
        int[] array = new int[N];
        s = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }

        System.out.println(array[k-1]);
    }
}
