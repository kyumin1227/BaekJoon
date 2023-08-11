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
        int pCount = 0; // P의 개수

        double average = 0; // 학점 평균

        for (int i = 0; i < index; i++) {
            boolean itsP = false;
            array[i] = sc.nextLine();

            StringTokenizer st = new StringTokenizer(array[i], " ");

            subjects[i] = st.nextToken();
            credits[i] = Double.parseDouble(st.nextToken());
            ranks[i] = st.nextToken();

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
                pCount++;
                itsP = true;
            }

            if (!itsP) {
                sumCredit += credits[i];
            }
        }

        average = sum / sumCredit;

        System.out.println(Math.round(average * 1000000) / 1000000.0);

    }
}
