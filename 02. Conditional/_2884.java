import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputH = sc.nextInt();
        int inputM = sc.nextInt();

        int copyM = inputM-45;
        int copyH = inputH-1;

        if(copyM <0) {
            inputM = 60+copyM;
            if(copyH<0) {
                inputH=24+copyH;
            } else {
                inputH-=1;
            }
        } else {
            inputM-=45;
        }System.out.println(inputH+" "+inputM);
    }
}
