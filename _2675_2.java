import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class _2675_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // num = 받을 문자열의 갯수, range = 문자열의 반복 횟수, S = 문자열
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++) {
            int range = sc.nextInt();
            String S = sc.next();
            for(int j=0; j<S.length(); j++) {                           // S 문자열의 길이만큼 반복
                for(int ii=0; ii<range; ii++) {                         // S 문자열의 j 번을 range 만큼 반복
                    bw.write(Character.toString(S.charAt(j)));          // 한글자씩 string으로 변환하여 write
                }
            }
            bw.write("\n");                                         // 한 문자열이 끝나면 줄바꿈
        }
        bw.flush();
        bw.close();
    }
}
