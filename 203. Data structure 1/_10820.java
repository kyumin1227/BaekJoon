import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();
        String s = "";
        while((s = br.readLine()) != null) {
            arrayList.add(s);
        }

        for(String str : arrayList) {
            int[] answerArray = new int[4];

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if(c >= 97 && c <= 122) {
                    answerArray[0]++;
                } else if (c >= 65 && c <= 90) {
                    answerArray[1]++;
                } else if (c >= 48 && c <= 57) {
                    answerArray[2]++;
                } else {
                    answerArray[3]++;
                }
            }

            for (int i : answerArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
