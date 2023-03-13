import java.util.Scanner;

public class _2525_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputH = sc.nextInt(); //시
        int inputM = sc.nextInt(); //분
        int inputT = sc.nextInt(); //걸리는 분

        int answerH, answerM, sumH, sumM;

        answerH = inputH;
        answerM = inputM;
        sumM = inputM+inputT; //걸리는 분 합계
        if(sumM>=60) {
            while(sumM>=60) { //분이 60분 이상일 경우 반복문으로 1시간 올리고 60분씩 차감
                answerH+=1;
                if(answerH>=24) { //시가 24시 이상일 경우 0시로 만듦
                    answerH = 0;
                }
                sumM-=60;
            } answerM = sumM; //분이 60분 이하가 되어 반복문을 빠져나올 경우 해당 분의 합계가 정답이므로 값을 줌
        } else { //분과 걸리는 분의 합계가 60이 안될 경우
            answerM = inputM+inputT;
        }
        
        
        System.out.println(answerH+" "+answerM);
    }
}
