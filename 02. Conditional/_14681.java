import java.util.Scanner;

public class _14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();
        int inputB = sc.nextInt();

        if(inputA>0 && inputB>0) {
            System.out.println(1);
        } else if(inputA<0 && inputB<0) {
            System.out.println(3);
        } else if(inputA<0) {
            System.out.println(2);
        } else {
            System.out.println(4);
        }
    }
}
