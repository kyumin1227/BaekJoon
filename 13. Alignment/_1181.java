import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }
        
        // 배열 정렬
        Arrays.sort(array, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });

        // 중복 제거하여 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(array[0] + "\n");
        for (int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i-1]) )
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
