// 문제
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

// 입력
// 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

// 출력
// 주어진 수들 중 소수의 개수를 출력한다.

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 개수
        int count = 0; // 소수의 개수

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); // 소수인지 확인할 수
            boolean isGood = true; // 소수면 true

            if (num < 2) {
                continue;
            }

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) {
                count++;
            }
        }

        System.out.println(count);
    }
}
