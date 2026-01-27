package problems.programmers;
/*
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class solution12 {
    public double solution(int[] arr) {
        double sum = 0;

        for(int number : arr) {
            sum += number;
        }

        double answer = sum / arr.length;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution12().solution(new int[]{1,2,3,4,5}));
    }
}
