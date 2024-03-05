import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] binary = new int[s.length()];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = s.charAt(i) - 48;
        }
        
        int sum = 0;

        for (int i = 0; i < binary.length; i++) {
            sum += Math.pow(2, binary.length - 1 - i) * binary[i];
        }

        double checkNum = 0;
        int j = 1;
        while (checkNum < sum) {
            checkNum = Math.pow(8, j);
            j++;
        }

        double num = sum;
        StringBuilder sb = new StringBuilder();
        for (int i = j - 2; i >= 0; i--) {
            double n = num / Math.pow(8, i);
            num = num % Math.pow(8, i);
            sb.append((int) Math.floor(n));

        }

        if (s.equals("0"))
            sb.append(0);

        System.out.println(sb);

        
    }
}
