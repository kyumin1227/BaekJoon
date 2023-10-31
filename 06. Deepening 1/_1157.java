import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[26]; // 각 알파벳에 하나씩 할당 된 배열
        String input = sc.nextLine(); // 입력받은 문자열
        input = input.toUpperCase(); // 대문자로 변경
        int num = 0; // 각 문자의 코드

        char[] arrayInput = input.toCharArray(); // 입력받은 문자열을 character 배열로 정렬
        for (int i = 0; i < input.length(); i++) { // 각 알파벳의 코드에 맞게 array 배열에 정리
            num = (int) arrayInput[i];
            array[num - 65]++;
        }
        int maxIndex = 0;
        int count = 0;
        for (int i = 1; i < array.length; i++) { // 최대값 확인 및 최대값이 하나 이상일 경우 count로 체크
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
                count = 0;
            } else if (array[i] == array[maxIndex]) {
                count++;
            }
        }
        if (count == 0) { // count의 값에 따라 알파벳 또는 ? 출력
            System.out.println((char) (maxIndex + 65));
        } else {
            System.out.println("?");
        }
    }
}
