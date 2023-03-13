import java.util.Scanner;

public class _10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA, inputB, inputC;
        inputA = sc.nextInt();
        inputB = sc.nextInt();
        inputC = sc.nextInt();

        System.out.println((inputA+inputB)%inputC);
        System.out.println(((inputA%inputC)+(inputB%inputC))%inputC);
        System.out.println((inputA*inputB)%inputC);
        System.out.println(((inputA%inputC)*(inputB%inputC))%inputC);
    }
}
