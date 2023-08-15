// 문제
// 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!

// 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.

// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.

// 인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

// A+	4.5
// A0	4.0
// B+	3.5
// B0	3.0
// C+	2.5
// C0	2.0
// D+	1.5
// D0	1.0
// F	0.0
// P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

// 과연 치훈이는 무사히 졸업할 수 있을까?

// 입력
// 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.

// 출력
// 치훈이의 전공평점을 출력한다.

// 정답과의 절대오차 또는 상대오차가 
// \(10^{-4}\) 이하이면 정답으로 인정한다.

// 제한
// 1 ≤ 과목명의 길이 ≤ 50
// 과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.
// 학점은 1.0,2.0,3.0,4.0중 하나이다.
// 등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다.
// 적어도 한 과목은 등급이 P가 아님이 보장된다.

import java.util.Scanner;
import java.util.StringTokenizer;

public class _25206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = 20; // 들어올 값의 개수

        String[] array = new String[index]; // 문자열 전체를 받을 배열

        String[] subjects = new String[index]; // 과목명을 받을 배열
        double[] credits = new double[index]; // 학점을 받을 배열
        String[] ranks = new String[index]; // 평점을 받을 배열

        double sum = 0; // 점수 합계
        double sumCredit = 0; // 학점 합계

        double average = 0; // 학점 평균

        for (int i = 0; i < index; i++) {
            boolean itsP = false;
            array[i] = sc.nextLine();

            // array[i] 배열을 공백으로 구분
            StringTokenizer st = new StringTokenizer(array[i], " ");

            subjects[i] = st.nextToken(); // 과목명
            credits[i] = Double.parseDouble(st.nextToken()); // 학점
            ranks[i] = st.nextToken(); // 등급

            // 학점에 따른 점수 계산
            if (ranks[i].equals("A+")) {
                sum += credits[i] * 4.5;
            } else if (ranks[i].equals("A0")) {
                sum += credits[i] * 4.0;
            } else if (ranks[i].equals("B+")) {
                sum += credits[i] * 3.5;
            } else if (ranks[i].equals("B0")) {
                sum += credits[i] * 3.0;
            } else if (ranks[i].equals("C+")) {
                sum += credits[i] * 2.5;
            } else if (ranks[i].equals("C0")) {
                sum += credits[i] * 2.0;
            } else if (ranks[i].equals("D+")) {
                sum += credits[i] * 1.5;
            } else if (ranks[i].equals("D0")) {
                sum += credits[i] * 1.0;
            } else if (ranks[i].equals("P")) {
                itsP = true;
            }

            // p가 아닌 경우에만 계산에 반영
            if (!itsP) {
                sumCredit += credits[i];
            }
        }

        // 평균 등급 계산
        average = sum / sumCredit;

        // 출력시에는 소수점 6자리 까지 표시
        System.out.println(Math.round(average * 1000000) / 1000000.0);

    }
}
