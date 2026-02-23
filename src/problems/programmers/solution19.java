package problems.programmers;

public class solution19 {
    public long solution(long n) {
        long answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n / i == i && n % i == 0) {
                answer += (i + 1);
                break;
            }
        }

        if(answer == 0)
            return -1;

        answer = (long) Math.pow(answer, 2);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution19().solution(121));
    }
}
