import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                if (array[j] > array[j + 1]) {
                    int num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
