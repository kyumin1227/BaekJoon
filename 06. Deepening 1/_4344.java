import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int re = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < re; i++) {
            int student = sc.nextInt(); // 학생 수
            int total = 0;
            int[] rateArray = new int[student]; // 학생들의 성적을 저장할 배열
            for (int j = 0; j < student; j++) { // 성적을 입력받아 배열에 저장하고 총 성적의 합계를 구함
                rateArray[j] = sc.nextInt();
                total += rateArray[j];
            }
            double average = total / student; // 평균점수
            int count = 0;
            for (int j = 0; j < student; j++) { // 평균점수 넘는 학생의 수를 카운트
                if (rateArray[j] > average) {
                    count++;
                }
            }
            double averageUp = ((double) count / (double) student) * 100; // int값을 double로 형변환 후 평균 점수 넘는 학생의 비율 확인
            System.out.println(String.format("%.3f", averageUp) + "%"); // 소수점 넷재 자리에서 반올림 후 출력
        }

    }
}
