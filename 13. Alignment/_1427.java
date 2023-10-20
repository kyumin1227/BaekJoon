import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] array = s.toCharArray();
        Arrays.sort(array);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = array.length - 1; i >= 0 ; i--) {
            bw.write(array[i]);            
        }
        bw.flush();
        bw.close();
    }
}
