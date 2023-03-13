import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diceA = sc.nextInt();
        int diceB = sc.nextInt();
        int diceC = sc.nextInt();

        if(diceA==diceB && diceA==diceC) {
            System.out.println(10000+(diceA*1000));
        } else if(diceA==diceB) {
            System.out.println(1000+(diceA*100));
        } else if(diceA==diceC) {
            System.out.println(1000+(diceA*100));
        } else if(diceB==diceC) {
            System.out.println(1000+(diceB*100));
        } else {
            if(diceA>diceB && diceA>diceC) {
                System.out.println(diceA*100);
            } else if(diceB>diceA && diceB>diceC) {
                System.out.println(diceB*100);
            } else {
                System.out.println(diceC*100);
            }
        }
    }
}