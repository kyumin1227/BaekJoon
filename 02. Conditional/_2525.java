import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputH, inputM, inputT;

        inputH = sc.nextInt();  //현재 시간
        inputM = sc.nextInt();  //현재 시간
        inputT = sc.nextInt();  //요리하는데 걸리는 시간

        while(inputT>0) {
            if(inputM+inputT>60) {
                inputH+=1;
                
                if(inputH>23) {
                    inputH=0;
                    inputM=(inputM+inputT)-60;
                }
                inputT-=60;
            } else if(inputM+inputT==60){
                inputM=0;
                inputT-=60;
                inputH+=1;
            } else {
                inputM+=inputT;
                inputT=0;
            }
        }
        
        System.out.println(inputH+" "+inputM);
    }
}
