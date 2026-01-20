package problems.programmers;

// 두수의 차
//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
public class solution1 {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution1().solution(2, 3));
        System.out.println(new solution1().solution(100, 2));
    }
}
