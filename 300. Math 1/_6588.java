import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _6588 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        
        // 소수를 배열에 보관
        boolean[] primeCheck = new boolean[1000001];
        for (int i = 2; i < 1000000; i++) {
            int num = i + i;
            while (num < 1000000) {
                primeCheck[num] = true; // true는 소수가 아님
                num += i;
            }
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0)
                break;

            int a = 3;
            int b = 0;
            boolean goldenbach = false;

            while (a < num) {
                if (primeCheck[a]) {
                    a++;
                    continue;
                }
                b = num - a;
                if (!primeCheck[b]) {
                    goldenbach = true;
                    break;
                }
                a++;
            }

            if (goldenbach) {
                bw.write(num + " = " + a + " + " + b + "\n");
            } else {
                bw.write("Goldbach's conjecture is wrong.\n");
            }

        }

        bw.flush();
    }
}
