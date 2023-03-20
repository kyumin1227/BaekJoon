import java.util.Scanner;

public class _5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] student = new int[30];        // 입력 받은 번호의 배열에 1을 부여
        for(int i = 0; i<28; i++) {
            student[sc.nextInt()-1] = 1;
        }
        for(int i = 0; i<30; i++) {         // 1을 받지 못한 배열을 출력
            if(student[i]==0) {
                System.out.println(i+1);
            }
        }
    }
}
