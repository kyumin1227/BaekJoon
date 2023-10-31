import java.util.Scanner;

public class _1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();

        if(inputA>inputB) {
            System.out.println(">");
        } else if(inputA<inputB) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
