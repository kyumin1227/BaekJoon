import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];

        int num = 666;
        int count = 0;
        while (true) {
            if (count == N) {
                break;
            }
            String s = Integer.toString(num);
            char[] numSplit = s.toCharArray();
            int check = 0;
            loopOut: for (int i = 0; i < numSplit.length; i++) {
                if (numSplit[i] == 54) {
                    check++;
                    if (check == 3) {
                        array[count] = num;
                        count++;
                        break loopOut;
                    }
                } else {
                    check = 0;
                }
            }
            if (count == N)
                break;
            num++;
        }
        System.out.println(array[N - 1]);
    }
}
