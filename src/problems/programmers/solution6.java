package problems.programmers;

/*
정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
 */
public class solution6 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution6().solution(1,1));
    }
}
