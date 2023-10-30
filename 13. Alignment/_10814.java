import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class _10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }

        // 배열 정리
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] string1 = s1.split(" ");
                String[] string2 = s2.split(" ");
                int num1 = Integer.parseInt(string1[0]);
                int num2 = Integer.parseInt(string2[0]);
                if (num1 == num2) {
                    return 0;
                } else {
                    return num1 - num2;
                }
            }
        });

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String string : array) {
            bw.write(string + "\n");
        }
        bw.flush();
        bw.close();
    }
}
