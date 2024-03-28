import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        HashMap<Integer, Integer> number_map = new HashMap<>();
        Double sum = 0.0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];

            if (number_map.get(numbers[i]) == null) {
                number_map.put(numbers[i], 1);
            } else {
                number_map.put(numbers[i], number_map.get(numbers[i]) + 1);
            }
        }

        Arrays.sort(numbers);

        // 최빈값이 몇 번 나왔는지 구하기
        int max = number_map.entrySet().stream()
        .max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).get().getValue();

        // 최빈값들을 리스트로 구하기
        List<Integer> max_array = number_map.entrySet().stream()
        .filter((entry1) -> entry1.getValue() == max)
        .map(entry -> entry.getKey())
        .collect(Collectors.toList());

        int max_num = 0; // 최빈값 

        // 최빈값이 둘 이상이면 두번째 작은 값 출력
        if (max_array.size() > 1) {
            Collections.sort(max_array);
            max_num = max_array.get(1);
        } else {
            max_num = max_array.get(0);
        }

        System.out.println(Math.round(sum / n));
        System.out.println(numbers[n / 2]);
        System.out.println(max_num);
        System.out.println(numbers[numbers.length - 1] - numbers[0]);
        
    }
}