package problems.programmers;

import java.util.Arrays;
/*
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 */

public class solution16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int index = 1; index <= n; index++) {
            answer[index - 1] = (long) x * index;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new solution16().solution(10, 10)));
    }
}
