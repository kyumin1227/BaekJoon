import java.util.Scanner;

public class _2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numA = Integer.toString(sc.nextInt());
        String numB = Integer.toString(sc.nextInt());
        
        char[] charA = numA.toCharArray();
        char[] charB = numB.toCharArray();

        numA = "";
        numB = "";

        for(int i=2; i>=0; i--) {
            numA += charA[i]-48;
            numB += charB[i]-48;
        }
        if(Integer.parseInt(numA)>Integer.parseInt(numB)) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }
    }
}
