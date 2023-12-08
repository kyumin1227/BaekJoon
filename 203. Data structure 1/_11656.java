import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class _11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] array = new String[s.length()];

        for(int i = 0; i < array.length; i++) {
            array[i] = s.substring(i);
        }

        Arrays.sort(array);
        for (String str : array) {
            System.out.println(str);
        }
    }
}
