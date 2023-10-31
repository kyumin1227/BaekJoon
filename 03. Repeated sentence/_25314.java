import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputRange = sc.nextInt();
        while(inputRange>0) {
            System.out.print("long ");
            inputRange -=4;
        }
        System.out.print("int");
    }
}
