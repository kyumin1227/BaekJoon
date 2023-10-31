import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer inputA, inputB;
        inputA = sc.nextInt();
        inputB = sc.nextInt();

        System.out.println(inputA*(inputB%10));
        System.out.println(inputA*((inputB%100)/10));
        System.out.println(inputA*(inputB/100));
        System.out.println(inputA*inputB);
    }
}
