import java.util.Scanner;

public class _10950 {
    public static void main(String[] arags) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); //받을 값의 수

        int inputA[] = new int[x], inputB[] = new int[x];
        
        for(int i = 0; i<x; i++) {
            inputA[i] = sc.nextInt();
            inputB[i] = sc.nextInt();
        }
        for(int i = 0; i<x; i++) {
            System.out.println(inputA[i]+inputB[i]);
        }
    }
}