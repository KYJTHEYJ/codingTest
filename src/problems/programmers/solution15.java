package problems.programmers;

/*

 */
public class solution15 {
    public int solution(int n) {
        int answer = 0;

        for (int index = 1; index <= n; index++) {
            if(n / index >= 1) {
                if(n % index == 1) {
                    answer = index;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution15().solution(10));
    }
}
