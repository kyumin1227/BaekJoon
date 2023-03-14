import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputSum = sc.nextInt();        //물건의 총 합계
        int inputRange = sc.nextInt();      //물건의 갯수
        int inputA, inputB;                 //A = 물건의 가격, B = 구매 갯수
        int sum = 0;

        for(int i = 0; i<inputRange; i++) {
            inputA = sc.nextInt();
            inputB = sc.nextInt();
            sum += inputA*inputB;
        }
        if(sum==inputSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
