import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] array = new int[26];      // 알파벳 갯수만큼 배열을 생성
        for(int i = 0; i<26; i++) {     // 배열의 모든 값에 -1을 부여
            array[i] = -1;
        }

        for(int i = 0; i<s.length(); i++) {     // 입력받은 문자열의 길이만큼 반복
            char num = s.charAt(i);             // 문자열의 i번째 글자를 아스키 코드로 변환하여 만약 해당 코드의 배열값이 -1이라면 i를 배열의 값으로 부여
            if(array[num-97] == -1) {
                array[num-97] = i;
            }
        }
        for(int i = 0; i<26; i++) {             // 출력
            System.out.print(array[i]+" ");
        }
    }
}
