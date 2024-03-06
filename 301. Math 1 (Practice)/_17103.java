import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        int[] nums = new int[T];
        int max = 0;
        
        // 숫자를 저장하여 최대값을 구함
        for (int i = 0; i < T; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if (nums[i] > max)
                max = nums[i];
        }

        // 최대값 까지의 소수를 구함
        boolean[] primes = new boolean[max + 1];
        
        for (int i = 2; i < max; i++) {
            int check = i + i;

            while (check < max) {
                primes[check] = true;
                check += i;
            }
        }

        // 파티션의 수를 계산
        for (int i = 0; i < T; i++) {
            int count = 0;
            for (int j = 2; j <= nums[i] / 2; j++) {
                if (primes[j])
                    continue;
                int a = nums[i] - j;
                if (!primes[a])
                    count++;
            }
            System.out.println(count);
        }
    }
}
