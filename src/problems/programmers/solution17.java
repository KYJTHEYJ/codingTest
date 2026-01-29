package problems.programmers;

import java.util.Arrays;

/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class solution17 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int length = str.length();

        int[] answer = new int[length];

        for(int index = 0; index < length; index++) {
            answer[index] = Integer.parseInt(String.valueOf(str.toCharArray()[length - index - 1]));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new solution17().solution(12345L)));
    }
}
