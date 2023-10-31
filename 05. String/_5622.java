import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array = sc.next().toCharArray();
        int sum = 0;

        for(int i=0; i<array.length; i++) {
            int num = (int)array[i];
            if(num<=67) {
                sum+=3;
            } else if(num<=70) {
                sum+=4;
            } else if(num<=73) {
                sum+=5;
            } else if(num<=76) {
                sum+=6;
            } else if(num<=79) {
                sum+=7;
            } else if(num<=83) {
                sum+=8;
            } else if(num<=86) {
                sum+=9;
            } else {
                sum+=10;
            }
        }
        System.out.println(sum);
    }
}
