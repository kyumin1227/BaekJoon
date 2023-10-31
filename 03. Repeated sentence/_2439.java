import java.util.Scanner;

public class _2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        
        for(int i = 0; i<range; i++) {         //라인
            for(int j=0; j<range-i-1; j++) {   //앞의 공백
                System.out.print(" ");      //공백 출력
            }
            for(int j=0; j<=i; j++) {          //별 갯수
                System.out.print("*");      //별 출력
            }
            System.out.println();
        }
    }
}
