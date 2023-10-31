import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();           // 시험 본 과목의 개수
        double[] subject = new double[N];
        double best = 0;                   // 가장 잘 친 과목
        
        for(int i = 0; i<N; i++) {          // 과목의 점수를 배열에 저장하고 가장 잘 친 과목의 점수를 확인
            subject[i] = sc.nextInt();
            if(subject[i]>best)
                best = subject[i];
        }
        double[] subjectD = new double[N];
        double sum = 0;
        for(int i = 0; i<N; i++) {          // 고친 점수를 배열에 저장
            subjectD[i] = (subject[i]/best)*100;
            sum += subjectD[i];
        }
        System.out.printf("%.3f", sum/N);
    }
}
