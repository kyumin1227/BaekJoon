import java.io.*;

public class _11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int fixC = c;
            if(fixC >= 65 && fixC <= 90) {
                fixC += 13;
                if(fixC >= 91 && fixC <= 103) fixC -= 26;
            }
            if(fixC >= 97 && fixC <= 122) {
                fixC += 13;
                if(fixC >= 123 && fixC <= 135) fixC -= 26;

            }
            System.out.print(Character.toChars(fixC));

        }
    }
}
