// 문제
// 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

// 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

// A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

// 입력
// 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

// 출력
// 첫째 줄에 10진법 수 N을 B진법으로 출력한다.

import java.util.Scanner;

public class _11005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();
        int jin = sc.nextInt();

        int count = 0; // 자릿수

        // 자릿수 구하기

        while (true) {
            if (number >= Math.pow(jin, count)) {
                count++;
            } else {
                break;
            }
        }

        double answer[] = new double[count]; // double로 된 정답 배열

        count -= 1; // 첫째자리의 제곱근은 자릿수 -1 이기 때문에 1을 빼줌

        for (int i = count; i > 0; i--) {

            double target = Math.pow(jin, i); // count+1 자릿수의 제곱 값

            int count2 = 1; // count+1 자릿수의 값

            while (i > 0) {
                if (number >= target * count2) {
                    count2++;
                } else {
                    count2--;
                    break;
                }
            }
            answer[count - i] = count2;
            number = number - (Math.pow(jin, i) * (count2));
        }

        answer[count] = number;

        // 출력

        for (int i = 0; i < answer.length; i++) {
            int test = (int) answer[i];
            if (test < 10) {
                System.out.print(test);
            } else {
                test += 55;
                System.out.print((char) test);
            }
        }

    }
}
