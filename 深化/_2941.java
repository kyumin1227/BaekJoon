import java.util.Scanner;

public class _2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] array = input.toCharArray();

        int count = 0;

        for (int i = 1; i < array.length; i++) { // 크로아티아 알파벳은 뒷자리가 =, -, j 3종류 밖에 없기에 배열의 두 번째 자리부터 체크
            if (array[i] == '=' || array[i] == '-') { // 문자인 경우 확인
                if (array[i - 1] == 'z' && i >= 2 && array[i - 2] == 'd') { // 유일하게 3글자인 dz=의 경우 확인
                    count += 2; // dz=의 경우 3글자가 한글자로 취급됨으로 총 길이에서 -2를 해줌
                } else {
                    count += 1; // dz=이 아닐 경우 -1
                }
            } else if (array[i] == 'j' && (array[i - 1] == 'l' || array[i - 1] == 'n')) { // i의 값이 j 이면서 앞의 글자는 l 또는 n 인
                                                                                          // 경우
                count += 1;
            }
        }
        System.out.println(array.length - count); // 배열의 길이에서 크로아티아 알파벳의 글자수 - 1(dz=의 경우에는 -2)을 체크한 count만큼 빼줌
    }
}