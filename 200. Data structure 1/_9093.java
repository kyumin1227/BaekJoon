import java.io.*;

public class _9093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            bw.write(reverse.reverseString(br.readLine()) + "\n");
        }

        bw.flush();
        bw.close();

    }
}

class reverse {

    public static String reverseString(String str) {

        String[] array = str.split(" ");
        String s = "";

        for(int i = 0; i < array.length; i++) {
            char[] cArray = array[i].toCharArray();
            for (int j = array[i].length() - 1; j >= 0; j--) {
                s += Character.toString(cArray[j]);
            }
            s += " ";
        }

        return s;
    }
}