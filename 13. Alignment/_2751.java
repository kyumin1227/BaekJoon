import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // for (int i = N - 1; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         if (array[j] > array[j + 1]) {
        //             int num = array[j];
        //             array[j] = array[j + 1];
        //             array[j + 1] = num;
        //         }
        //     }
        // }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
