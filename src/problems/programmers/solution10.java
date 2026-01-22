package problems.programmers;

import java.util.Arrays;

/*
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */
public class solution10 {
    public double solution(int[] numbers) {
        double answer = 0;

        answer = Arrays.stream(numbers).average().orElse(0);
        // 스트림 지원이 안되는지 에러가 남

        /*
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        answer = (double) sum / numbers.length;
        */

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution10().solution(new int[]{1, 2, 3, 4, 5, 6 ,7 ,8 ,9, 10}));
    }
}
