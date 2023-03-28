import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class _2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = br.read();
        
        for(int i=0; i<num; i++) {
            String S = br.readLine();
            StringTokenizer st = new StringTokenizer(S, " ");
            for(int ii=0; ii<S.length()-2; ii++) {
                for(int j=0; j<Integer.parseInt(st.nextToken()); j++) {
                    bw.write(Character.toString(S.charAt(0)));
                }
            }
            bw.write("\r");
        }
        bw.flush();
        bw.close();
    }
}
