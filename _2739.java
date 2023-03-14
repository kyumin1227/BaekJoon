import java.util.Scanner;

public class _2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt(); //구구단의 앞자리

        for(int i = 1; i<10; i++) {
            System.out.printf(inputA+" * "+i+" = "+inputA*i+"\n");
        }
    }
}
