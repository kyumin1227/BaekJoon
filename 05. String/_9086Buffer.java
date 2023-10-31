import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class _9086Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] array = new String[num];
        for(int i = 0; i<num; i++) {
            array[i] = br.readLine();
            bw.write(array[i].charAt(0));
            bw.write(array[i].charAt(array[i].length()-1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
