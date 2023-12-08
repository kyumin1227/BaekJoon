import java.io.*;

public class _10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] array = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            array[c - 97]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : array) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}
