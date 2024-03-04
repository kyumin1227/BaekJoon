import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class _6588 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 소수를 배열에 보관
        boolean[] primeCheck = new boolean[500000];
        for (int i = 2; i < 250000; i++) {
            int num = i;
            while (num < 250000) {
                num += i;
                primeCheck[num] = true; // true는 소수가 아님
            }
        }
        
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 0;
        for (int i = 3; i < primeCheck.length; i++) {
            if (primeCheck[i] == false) {
                primes.add(i);
            }
        }

        while (true) {
            num = Integer.parseInt(br.readLine());
            if (num == 0)
                break;

            int a = 0;
            int b = 0;
            boolean goldenbach = false;

            for (int i = 0; i < primes.size(); i++) {
                a = num - primes.get(i);
                if (primes.contains(a)) {
                    b = primes.get(i);
                    goldenbach = true;
                    break;
                }
            }

            if (goldenbach) {
                bw.write(num + " = " + b + " + " + a + "\n");
            } else {
                bw.write("Goldbach's conjecture is wrong.\n");
            }

        }

        bw.flush();
    }
}
