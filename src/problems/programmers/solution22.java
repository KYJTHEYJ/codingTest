package problems.programmers;

public class solution22 {
    public long solution(int a, int b) {
        if(!(a > -10000000 && a < 10000000 && b > -10000000 && b < 10000000)) {
            throw new IllegalArgumentException("제한 조건에 어긋남");
        }

        long answer = 0;

        if(a > b) {
            for(long index = a; index >= b; index--) {
                answer += index;
            }
        }

        if(a < b) {
            for(long index = a; index <= b; index++) {
                answer += index;
            }
        }

        if(a == b) {
            return a;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution22().solution(5, 3));
    }
}
