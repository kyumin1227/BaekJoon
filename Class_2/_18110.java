import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _18110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 입력이 0인 경우 0을 출력 후 종료
        if (n == 0) {
            System.out.println(0);
            System.exit(0);
        }

        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers.add(num);
        }
        br.close();

        Collections.sort(numbers);

        int popNum = (int) Math.round(n * 0.15);

        double sum = 0;
        for (int i = popNum; i < n - popNum; i++) {
            sum += numbers.get(i);
        }

        System.out.println(Math.round(sum / (numbers.size() - 2 * popNum)));
    }
}