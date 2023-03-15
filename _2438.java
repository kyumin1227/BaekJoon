import java.util.Scanner;

public class _2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        for(int i = 0; i<range; i++) { //라인
            for(int j = 0; j<=i; j++) { //별 개수
                System.out.print("*"); //출력
            }
            System.out.println();
        }
    }
}
